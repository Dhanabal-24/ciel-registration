package backend.controller;

import backend.entity.Student;
import backend.repository.StudentRepository;

import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/api/students")

@CrossOrigin(origins = "http://localhost:3000")

public class StudentController {

    private final StudentRepository repository;

    public StudentController(
            StudentRepository repository) {

        this.repository = repository;
    }

    @PostMapping

    public Student saveStudent(
            @RequestBody Student student) {

        return repository.save(student);
    }
}