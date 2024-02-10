package com.demo.ms22task.dao.entity;


import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table(name="students")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    @Column(name="student_number")
    private String studentNumber;
    private String name;
    private String surname;
    @Column(name="group_number")
    private String groupNumber;
    @Column(name = "scholarship")
    private BigDecimal scholarShip;
    private String major;
    private String color;


}
