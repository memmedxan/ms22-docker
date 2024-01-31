package com.demo.ms22task.dao.repository;

import com.demo.ms22task.dao.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentEntity,Long> {
}
