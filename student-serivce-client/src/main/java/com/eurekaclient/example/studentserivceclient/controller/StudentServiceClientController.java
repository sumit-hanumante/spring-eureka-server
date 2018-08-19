package com.eurekaclient.example.studentserivceclient.controller;

import com.eurekaclient.example.studentserivceclient.service.StudentServiceClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sumit on 8/20/2018.
 */
@RestController
public class StudentServiceClientController {

    @Autowired
    StudentServiceClientService studentServiceClientService;

    @GetMapping("/student/{id}")
    public String getStudenInfo(@PathVariable int id){
        return studentServiceClientService.getStudentInfoFromStudenService(id);
    }
}
