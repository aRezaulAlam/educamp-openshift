package com.agroho.repository;

import com.agroho.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by USER on 4/14/2016.
 */
@Repository
public class StudentRepository {

    @Autowired
    StudentJpaRepository studentJpaRepository;

    @Autowired
    StudentCustomJpaRepository studentCustomJpaRepository;

    public Student getStudentById(Long studentId){
        return studentJpaRepository.findOne(studentId);
    }

    public List<Student> finAllStudents(){
        List<Student> students = studentJpaRepository.findAll();
        return students;
    }

    public Student getStudentByName(Long studentId){
        return studentCustomJpaRepository.findStudentByStudentId(studentId);
    }

    public String createStudent(Student student){
        studentJpaRepository.saveAndFlush(student);

        return student.getStudentName();
    }

    public String updateStudent(Student student){
        studentJpaRepository.saveAndFlush(student);
        return student.getStudentName();
    }

    public void deleteStudent(Long id){
        studentJpaRepository.delete(id);
    }
}
