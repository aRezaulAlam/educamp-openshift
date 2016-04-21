package com.agroho.controller;

import com.agroho.model.Author;
import com.agroho.model.Student;
import com.agroho.service.AuthorService;
import com.agroho.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by USER on 4/16/2016.
 */
@RestController
public class AuthorController {

    @Autowired
    AuthorService authorService;

    @CrossOrigin
    @RequestMapping(value = "/authors", method = RequestMethod.GET)
    public List<Author> getAuthors(){

        List<Author> authors = authorService.getAllAuthors();
        return authors;
    }

    @CrossOrigin
    @RequestMapping(value = "/author", method = RequestMethod.POST)
    public void createUser(@RequestBody final Author author) {

         author.setId(author.getFirstName().toLowerCase()+"-"+author.getLastName().toLowerCase());
         authorService.save(author);
    }

}
/*
# DataSource settings: set here your own configurations for the database
        # connection. In this example we have "netgloo_blog" as database name and
        # "root" as username and password.


        # Keep the connection alive if idle for a long time (needed in production)
        spring.datasource.testWhileIdle = true
        spring.datasource.validationQuery = SELECT 1

        # Show or not log for each sql query
        spring.jpa.show-sql = true

        # Hibernate ddl auto (create, create-drop, update)
        spring.jpa.hibernate.ddl-auto = update

        # Naming strategy
        spring.jpa.hibernate.naming-strategy = org.hibernate.cfg.ImprovedNamingStrategy

        # Use spring.jpa.properties.* for Hibernate native properties (the prefix is
        # stripped before adding them to the entity manager)

        # The SQL dialect makes Hibernate generate better SQL for the chosen database

        SerializationFeature.FAIL_ON_EMPTY_BEANS=false

        spring.datasource.url=jdbc:h2:file:~/edudb;FILE_LOCK=FS
        spring.datasource.driverClassName=org.h2.Driver
        spring.datasource.username=sa
        spring.datasource.password=
        spring.jpa.database-platform=org.hibernate.dialect.H2Dialect

        spring.h2.console.enabled=true
        spring.h2.console.path=/h2-console

        spring.datasource.url= jdbc:postgresql://localhost:5432/edu
spring.datasource.username=postgres
spring.datasource.password=sky

spring.jpa.hibernate.ddl-auto=update



//


# Keep the connection alive if idle for a long time (needed in production)
spring.datasource.testWhileIdle = true
spring.datasource.validationQuery = SELECT 1

# Show or not log for each sql query
spring.jpa.show-sql = true

# Hibernate ddl auto (create, create-drop, update)
spring.jpa.hibernate.ddl-auto = update

# Naming strategy
spring.jpa.hibernate.naming-strategy = org.hibernate.cfg.ImprovedNamingStrategy

# Use spring.jpa.properties.* for Hibernate native properties (the prefix is
# stripped before adding them to the entity manager)

# The SQL dialect makes Hibernate generate better SQL for the chosen database

SerializationFeature.FAIL_ON_EMPTY_BEANS=false


spring.datasource.url= jdbc:postgresql://localhost:5433/edu
spring.datasource.username=postgres
spring.datasource.password=postgres
spring.datasource.driverClassName=org.postgresql.Driver


spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.generate-ddl=true



*/
