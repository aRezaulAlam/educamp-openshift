package com.agroho.service;

import com.agroho.model.Student;
import com.agroho.repository.StudentJpaRepository;
import com.agroho.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by USER on 4/14/2016.
 */
@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    StudentRepository studentRepository;

    public Student getStudentById(Long studentId){
        Student student = studentRepository.getStudentById(studentId);
        return student;
    }

    public List<Student > getAllStudents(){

        List<Student> students = studentRepository.finAllStudents();
        return students;
    }

    public Student getStudentByName(Long studentId){
        return studentRepository.getStudentByName(studentId);
    }

    public String createStudent(Student student){
        return "Success: "+studentRepository.createStudent(student);
    }

    public String updateStudent(Student student){
       return "Success: "+studentRepository.updateStudent(student);
    }

    public void deleteStudent(Long id){
        studentRepository.deleteStudent(id);
    }
}
