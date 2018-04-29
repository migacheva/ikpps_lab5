package ru.vlsu.controller;

import org.springframework.web.bind.annotation.*;
import ru.vlsu.domain.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by amigacheva on 20.03.2018.
 */
@RestController
public class StudentsController {

    private List<Student> students = new ArrayList<>();

    @GetMapping("/students")
    public List<Student> readStudents() {
        return students;
    }

    @GetMapping("/students/{id}")
    public Student readStudents(@PathVariable Integer id) {
        return students.get(id);
    }

    @PostMapping("/students")
    public Student createStudent(@RequestBody Student student) {
        students.add(student);
        return student;
    }

}
