package com.agroho.repository;

import com.agroho.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by USER on 4/14/2016.
 */
@Repository
public interface StudentJpaRepository extends JpaRepository<Student, Long> {


}
