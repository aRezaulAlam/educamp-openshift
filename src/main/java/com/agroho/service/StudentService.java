package com.agroho.service;

import com.agroho.model.Student;

import java.util.List;

/**
 * Created by USER on 4/14/2016.
 */
public interface StudentService {

    public Student getStudentById(Long studentId);

    public List<Student > getAllStudents();

    public Student getStudentByName(Long studentId);

    public String createStudent(Student student);

    public String updateStudent(Student student);

    public void deleteStudent(Long id);
}
