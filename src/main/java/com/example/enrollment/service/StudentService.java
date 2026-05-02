package com.example.enrollment.service;

import com.example.enrollment.model.Student;
import com.example.enrollment.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repo;

    public List<Student> getAll() {
        return repo.findAll();
    }

    public void save(Student student) {
        repo.save(student);
    }

    public Student getById(Long id) {
        return repo.findById(id).orElse(null);
    }
}
