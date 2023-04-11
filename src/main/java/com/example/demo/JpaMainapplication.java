package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;

@SpringBootApplication
public class JpaMainapplication implements CommandLineRunner {
    @Autowired
    StudentService service;
    public static void main(String[] args) {
        SpringApplication.run(JpaMainapplication.class,args);
    }

    @Override
    public void run(String... args) throws Exception {
        Student student = service.findById(1001);
        System.out.println(student);
        service.deleteById(1001);
    }
}
