package com.example.enrollment.controller;

import com.example.enrollment.model.Student;
import com.example.enrollment.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/students")
    public String list(Model model) {
        model.addAttribute("students", service.getAll());
        return "students/list";
    }

    @GetMapping("/add")
    public String form(Model model) {
        model.addAttribute("student", new Student());
        return "students/form";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Student student) {
        service.save(student);
        return "redirect:/students";
    }
}
