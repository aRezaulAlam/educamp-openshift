package com.agroho.repository;

import com.agroho.model.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;



/**
 * Created by USER on 4/14/2016.
 */

public interface StudentCustomJpaRepository extends Repository<Student,Long> {

    @Query(value="select * from student where student_id=:student_id", nativeQuery = true)
    Student findStudentByStudentId(@Param("student_id") Long studentId);
}
