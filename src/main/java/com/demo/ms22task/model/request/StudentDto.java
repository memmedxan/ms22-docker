package com.demo.ms22task.model.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentDto {


    @NotBlank(message = "Student number must not be blank")
    private String studentNumber;
    private String name;
    private String surname;
    private String groupNumber;
    private BigDecimal scholarship;
    private String major;

}
