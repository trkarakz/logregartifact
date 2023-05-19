package com.logreg.logregartifact.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND) // 404
public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(String email) {
        super("User with " + email + " does not exist.");
    }

}
