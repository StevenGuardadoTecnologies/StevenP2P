package com.Steven_Tecnologies.P2P_Lending.api.exception;

public class EmailAlreadyExistsException extends  RuntimeException {

    public  EmailAlreadyExistsException(String message){
        super(message);
    }
}
