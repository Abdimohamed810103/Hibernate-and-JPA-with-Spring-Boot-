package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class StudentServiceTest {

    @Autowired
    StudentService service;
    @Test
    void findByIdTest() {
        Student student = service.findById(1001);
        assertEquals("Abdi Mohamed", student.getName());
    }

    @Test
    @DirtiesContext
    void deleteById() {
        service.deleteById(1002);
        Student student = service.findById(1001);
        assertNull(student);
    }
}