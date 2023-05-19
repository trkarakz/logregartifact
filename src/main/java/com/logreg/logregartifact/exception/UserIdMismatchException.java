package com.logreg.logregartifact.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT) // 409
public class UserIdMismatchException extends RuntimeException {

}
