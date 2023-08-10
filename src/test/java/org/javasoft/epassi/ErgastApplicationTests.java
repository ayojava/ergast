package org.javasoft.epassi;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.client.WireMock;
import com.github.tomakehurst.wiremock.core.WireMockConfiguration;
import lombok.val;
import org.assertj.core.api.Assertions;
import org.javasoft.epassi.payload.ergast.races.Race;
import org.javasoft.epassi.payload.ergast.seasons.Season;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.javasoft.epassi.Data.*;
import static org.javasoft.epassi.api.ClientAPI.*;
import static org.javasoft.epassi.api.ErgastAPI.SEASONS_API;
import static org.javasoft.epassi.security.AuthenticationFilter.AUTH_TOKEN_HEADER;
import static org.javasoft.epassi.security.AuthenticationFilter.AUTH_TOKEN_VALUE;
import static org.springframework.http.HttpStatus.OK;

@ActiveProfiles("test")
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ErgastApplicationTests {

	private static WireMockServer wireMockServer;

	@LocalServerPort
	private int port;

	private static HttpEntity requestEntity;


	@Autowired
	public TestRestTemplate testRestTemplate;


	@BeforeAll
	static void init() {
		wireMockServer = new WireMockServer(
				new WireMockConfiguration().port(7070)
		);
		wireMockServer.start();
		WireMock.configureFor("localhost", 7070);

		val requestHeaders = new HttpHeaders();
		requestHeaders.add(AUTH_TOKEN_HEADER ,AUTH_TOKEN_VALUE);

		requestEntity = new HttpEntity<>(null, requestHeaders);
	}
	@Test
	void testAllSeasons() {

		generateStub(SEASONS_API,ALL_SEASONS_DATA);

		String path = createUrlWithPort(ALL_SEASONS_API);

		ResponseEntity<List<Season>> responseEntity = testRestTemplate.exchange(path, HttpMethod.GET, requestEntity, new ParameterizedTypeReference<>() {
		});
		List<Season> entityBody = responseEntity.getBody();

		assertThat(200 ,is(responseEntity.getStatusCodeValue()));

		assertThat(entityBody, is(notNullValue()));

		Assertions.assertThat(entityBody)
				.hasSize(74)
				.contains(new Season("2023" ,"https://en.wikipedia.org/wiki/2023_Formula_One_World_Championship"))
				.contains(new Season("1950" ,"http://en.wikipedia.org/wiki/1950_Formula_One_season"));

		verifyCall(SEASONS_API);

	}


	@Test
	void testRaceForASeason() {
		String season = "2019";
		String RACE_API = "/" + season + ".json";

		generateStub(RACE_API,ALL_RACES_DATA);
		String path = createUrlWithPort(ALL_RACES_API);

		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(path)
				.queryParam("season", season);
		ResponseEntity<List<Race>> responseEntity = testRestTemplate.exchange(builder.build().encode().toUri(), HttpMethod.GET, requestEntity, new ParameterizedTypeReference<>() {
		});
		List<Race> entityBody = responseEntity.getBody();

		assertThat(200 ,is(responseEntity.getStatusCodeValue()));

		assertThat(entityBody, is(notNullValue()));

		Assertions.assertThat(entityBody).hasSize(21);

		verifyCall(RACE_API);
	}

	private void generateStub(String testUrl , String body){
		stubFor(any(urlPathEqualTo("/api/f1" + testUrl))
				.withQueryParam("limit", equalTo("1000"))
				.withQueryParam("offset", equalTo("0"))
				.willReturn(aResponse()
						.withBody(body)
						.withStatus(OK.value())));
	}

	private void verifyCall(String api){
		verify(getRequestedFor(urlPathEqualTo("/api/f1"+ api))
				.withQueryParam("limit", equalTo("1000"))
				.withQueryParam("offset", equalTo("0")));
	}


	private String createUrlWithPort(String uri) {
	final val stringBuilder = new StringBuilder();
	return stringBuilder.append("http://localhost")
			.append(":")
			.append(port)
			.append("/ergast")
			.append(API)
			.append(uri)
			.toString();
	}

}
