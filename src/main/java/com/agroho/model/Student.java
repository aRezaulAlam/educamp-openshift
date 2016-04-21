package com.agroho.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

/**
 * Created by USER on 4/14/2016.
 */
@Entity
public class Student {


    @Id
    @TableGenerator(name="TABLE_GEN",table="T_GENERATORS",pkColumnName="GEN_KEY",pkColumnValue="TEST",valueColumnName="GEN_VALUE",initialValue=1,allocationSize=1)
    @GeneratedValue(strategy=GenerationType.TABLE, generator="TABLE_GEN")
    private Long studentSerialNo;
    private Long studentId;
    private String studentName;
    private String department;

    public Student(){

    }

    public Student(String studentName, String department, Long studentId, Long studentSerialNo) {
        this.studentName = studentName;
        this.department = department;
        this.studentId = studentId;
        this.studentSerialNo = studentSerialNo;
    }

    public Long getStudentSerialNo() {
        return studentSerialNo;
    }

    public void setStudentSerialNo(Long studentSerialNo) {
        this.studentSerialNo = studentSerialNo;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


}
