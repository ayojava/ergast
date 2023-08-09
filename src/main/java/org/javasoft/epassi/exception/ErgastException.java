package org.javasoft.epassi.exception;

public class ErgastException extends RuntimeException{

    public ErgastException(String message ){
        super(message);
    }
    public ErgastException(String message , Throwable ex){
        super(message , ex);
    }
}
