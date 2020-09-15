package com.example.demo.dependency_demo;

import org.springframework.stereotype.Component;

@Component
public class Customers {
    private int custId;
    private String cusrName;
    private String courseName;

    private Technologies techDetails;

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getCusrName() {
        return cusrName;
    }

    public void setCusrName(String cusrName) {
        this.cusrName = cusrName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void display() {
        System.out.println("customers object returned sucessfully");
    }

    public Technologies getTechDetails() {
        return techDetails;
    }

    public void setTechDetails(Technologies techDetails) {
        this.techDetails = techDetails;
    }
}
