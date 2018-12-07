package com.springboot.db;


import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.springboot.db.repository")

public class SpringBootMySqlApp {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMySqlApp.class, args);
        //log.error("success");
    }
}
