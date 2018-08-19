package com.eurekaclient.example.studentserivce.controller;

import com.eurekaclient.example.studentserivce.model.Student;
import com.eurekaclient.example.studentserivce.service.StudentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by sumit on 8/19/2018.
 */

@RestController
public class StudentServiceController {

    @Autowired
    StudentInfoService studentInfoService;

    @GetMapping("/student/{id}")
    public Student getStudentInfo(@PathVariable int id){
        return studentInfoService.getStudentInfById(id);
    }
}
