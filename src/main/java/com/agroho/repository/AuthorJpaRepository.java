package com.agroho.repository;

import com.agroho.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by USER on 4/16/2016.
 */
@Repository
public interface AuthorJpaRepository extends JpaRepository<Author,Long> {
}
