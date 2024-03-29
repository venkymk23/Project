package com.venkycode.studentsystem.service;

import java.util.List;

import com.venkycode.studentsystem.model.Student;

public interface StudentService {
public Student saveStudent(Student student);
public List<Student> getAllStudents();
};
