package com.agroho.service;

import com.agroho.model.Author;
import com.agroho.model.Student;
import com.agroho.repository.AuthorJpaRepository;
import com.agroho.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by USER on 4/16/2016.
 */
@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    AuthorRepository authorRepository;

    @Override
    public List<Author> getAllAuthors() {
        List<Author> authors = authorRepository.finAllStudents();
        return authors;
    }

    @Override
    public void save(Author author) {
        authorRepository.save(author);
    }
}
