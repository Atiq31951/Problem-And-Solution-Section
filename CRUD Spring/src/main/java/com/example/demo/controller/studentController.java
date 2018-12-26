package com.example.demo.controller;
import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.jws.WebParam;
import java.util.ArrayList;
import java.util.List;

@Controller
public class studentController {
    @Autowired
    private StudentRepository studentRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        String name="Atiqur rahman";
        model.addAttribute("name",name);
        List<Student> list= studentRepository.findAll();
        model.addAttribute("list",list);
        return  "index";
    }

    @RequestMapping(value = "/insert", method = RequestMethod.GET)
    public String CreateStudent(Model model) {
        Student student=new Student();
        model.addAttribute("student",student);
        return  "createStudent";
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String CreateStudentPost(Model model, @ModelAttribute("student") Student student) {
        studentRepository.save(student);
        return  "index";
    }
}
