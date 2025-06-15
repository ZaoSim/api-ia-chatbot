package com.joaoe.ia_chatbot.modules.user.exception;

public abstract class UserException extends RuntimeException{
    protected UserException(String message){
        super(message);
    }

    protected UserException(String message, Throwable cause){
        super(message, cause);
    }
}
