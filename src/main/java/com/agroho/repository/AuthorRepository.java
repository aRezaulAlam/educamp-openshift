package com.agroho.repository;


import com.agroho.model.Author;
import com.agroho.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by USER on 4/16/2016.
 */
@Repository
public class AuthorRepository {

    @Autowired
    AuthorJpaRepository authorJpaRepository;


    public List<Author> finAllStudents(){
        List<Author> authors = authorJpaRepository.findAll();
        return authors;
    }

    public void save(Author author){
        authorJpaRepository.saveAndFlush(author);
    }
}
