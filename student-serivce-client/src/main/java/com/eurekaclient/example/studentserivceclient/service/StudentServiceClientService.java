
package com.eurekaclient.example.studentserivceclient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by sumit on 8/20/2018.
 */
@Service
public class StudentServiceClientService {

    @Autowired
    RestTemplate restTemplate;

    public String getStudentInfoFromStudenService(int id){
        String student = restTemplate.getForObject("http://student-service/student/{id}",String.class,id);
        return student;
    }
}
