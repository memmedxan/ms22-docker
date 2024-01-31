package com.demo.ms22task.model.request.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorMessage {

    STUDENT_NOT_FOUND("Student not found by id : {}");

    private final String message;

    public String getMessage(Long id){
        return this.message.replace("{}",String.valueOf(id));
    }

}
