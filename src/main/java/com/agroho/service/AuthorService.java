package com.agroho.service;

import com.agroho.model.Author;
import com.agroho.model.Student;

import java.util.List;

/**
 * Created by USER on 4/16/2016.
 */
public interface AuthorService {
    public List<Author> getAllAuthors();
    public void save(Author author);
}
