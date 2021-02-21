package com.sample.service;

import com.sample.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> listStudents();

    Student addStudent(Student student);

    Student getStudent(Long id);

    Student updateStudent(Long id, Student student);

    void deleteStudent(Long id);
}
