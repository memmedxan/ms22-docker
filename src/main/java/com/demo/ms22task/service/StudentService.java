package com.demo.ms22task.service;

import com.demo.ms22task.dao.repository.StudentRepository;
import com.demo.ms22task.exception.StudentNotFoundException;
import com.demo.ms22task.model.request.StudentDto;
import com.demo.ms22task.model.request.enums.ErrorMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.demo.ms22task.mapper.StudentMapper.STUDENT_MAPPER;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;



    public void createStudent(StudentDto studentDto){
        var mappedStudent = STUDENT_MAPPER.mapToStudentEntity(studentDto);
        studentRepository.save(mappedStudent);
    }

    public StudentDto getStudentById(Long id){
        return studentRepository.findById(id)
                .map(STUDENT_MAPPER::mapToStudentDto)
                .orElseThrow(()-> new StudentNotFoundException(ErrorMessage.STUDENT_NOT_FOUND.getMessage(id)));
    }


    public List<StudentDto> getAllStudents(){
        return studentRepository.findAll()
                .stream()
                .map(STUDENT_MAPPER::mapToStudentDto)
                .toList();
    }

    public void deleteStudent(Long id){

        studentRepository.deleteById(id);


    }


}
