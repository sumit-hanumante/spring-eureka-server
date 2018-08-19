package com.eurekaclient.example.studentserivce.service;

import com.eurekaclient.example.studentserivce.model.Student;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sumit on 8/19/2018.
 */
@Service
public class StudentInfoService {


    /**
     * this studentData is only for example
     * ideally it should come from db whose and whose code should be in
     * StudentinfoRepository class
     *
     */
    private static Map<Integer,Student> studentData ;

    static {
        studentData = new HashMap<>();
        Student firstStudent = new Student(1,"Aayush", "Delhi Public School");
        Student secondStudent = new Student(2,"Gajendra", "Delhi Public School");
        Student thirdStudent = new Student(3,"sumit", "Delhi Public School");
        Student fourthStudent = new Student(4,"Sharad", "Mumbai Public School");

        studentData.put(1,firstStudent);
        studentData.put(2,secondStudent);
        studentData.put(3,thirdStudent);
        studentData.put(4,fourthStudent);
    }


    public Student getStudentInfById(int id){
        return studentData.get(id);
    }
}
