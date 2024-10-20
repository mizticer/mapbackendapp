package com.employeedashboard.oirs.exception;

import lombok.EqualsAndHashCode;
import lombok.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@Value
@EqualsAndHashCode(callSuper = false)
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class EmployeeAlreadyExistException extends RuntimeException {
    private String firstName;
    private String lastName;
}
