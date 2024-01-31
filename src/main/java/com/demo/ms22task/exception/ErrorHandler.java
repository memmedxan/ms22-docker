package com.demo.ms22task.exception;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

@RestControllerAdvice
public class ErrorHandler {

    @ExceptionHandler(StudentNotFoundException.class)
    @ResponseStatus(BAD_REQUEST)
    public ErrorResponse handle(HttpServletRequest request,
                                StudentNotFoundException exception) {
        return ErrorResponse.builder()
                .message(exception.getMessage())
                .statusCode(401)
                .path(request.getServletPath()).build();
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(BAD_REQUEST)
    public ErrorResponse handle(HttpServletRequest request, MethodArgumentNotValidException exception) {
        return ErrorResponse.builder()
                .message(exception.getFieldError().getDefaultMessage()).statusCode(400).path(request.getServletPath()).build();




}
}