package com.agroho.controller;
import com.agroho.model.Student;
import com.agroho.service.StudentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by USER on 4/13/2016.
 */

@Controller
@RequestMapping("/api/v1/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public List<Student> getStudents(){

        List<Student> students = studentService.getAllStudents();
        return students;
    }

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Student getStudentByName(@PathVariable("id") Long id){

        System.out.println("Student ID: "+id);
        Student student = studentService.getStudentByName(id);
        System.out.println("Getting Value: "+student.getStudentName());

        return student;
    }

    @RequestMapping(value = "sl/{serial}", method = RequestMethod.GET)
    @ResponseBody
    public Student getStudentById(@PathVariable("serial") Long serial) {

        Student student = studentService.getStudentById(serial);
        System.out.println("Getting Value: "+student.getStudentName());
        return student;

    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    @ResponseBody
    public String addStudent(@RequestBody Student student){

        String response = studentService.createStudent(student);

        return response;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public String updateStudent(@PathVariable("id") Long id ,@RequestBody Student student){

        student.setStudentSerialNo(id);
        String response = studentService.updateStudent(student);
        return response;
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public String deleteStudent(@PathVariable("id") Long id){
        studentService.deleteStudent(id);
        return "success";
    }



}

