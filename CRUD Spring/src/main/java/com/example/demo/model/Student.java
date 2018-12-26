package com.example.demo.model;


import org.springframework.stereotype.Controller;

import javax.persistence.*;

@Controller
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    @Column(name = "father_name")
    private String fatherName;
    @Column(name = "mother_name")
    private String mothername;
    private String email;
    private String geneder;
    private String mobile;

    public Student() {
    }

    public Student(String name, String fatherName, String mothername, String geneder, String mobile) {
        this.name = name;
        this.fatherName = fatherName;
        this.mothername = mothername;
        this.geneder = geneder;
        this.mobile = mobile;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMothername() {
        return mothername;
    }

    public void setMothername(String mothername) {
        this.mothername = mothername;
    }

    public String getGeneder() {
        return geneder;
    }

    public void setGeneder(String geneder) {
        this.geneder = geneder;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", mothername='" + mothername + '\'' +
                ", geneder='" + geneder + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
