package com.eurekaclient.example.studentserivceclient.model;

/**
 * Created by sumit on 8/19/2018.
 */
public class Student {

    private int id;
    private String name;
    private String schoolName;

    public Student(int id, String name, String schoolName) {
        this.id = id;
        this.name = name;
        this.schoolName = schoolName;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}
