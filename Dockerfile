FROM openjdk:11
LABEL maintainer="ayojava@gmail.com"
WORKDIR /app
COPY target/epassi-0.0.1-SNAPSHOT.jar /app/epassi.jar
ENTRYPOINT ["java","-jar","epassi.jar"]