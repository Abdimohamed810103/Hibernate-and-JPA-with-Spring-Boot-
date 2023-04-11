package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepo studentRepo;

    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public Student findById(int id){
        return studentRepo.findById(id).get();
    }
    public void deleteById(int id){
        Student student = findById(id);
        studentRepo.delete(student);
        studentRepo.flush();
    }
}
