package com.agroho.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by USER on 4/16/2016.
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(){
        return "index.html";
    }

/*
   @RequestMapping("/next")
    public String next(){
        return "next";
    }

    SerializationFeature.FAIL_ON_EMPTY_BEANS=false

spring.datasource.url=jdbc:h2:file:~/edudb;FILE_LOCK=FS
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect

spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

*/

}
