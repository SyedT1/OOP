/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypkg;

import java.util.*;

/**
 *
 * @author thinker
 */
class Student {

    int id;
    String name, dept, major;
    float cgpa;

    public Student() {
        id = 0;
        name = dept = major = "TBA";
        cgpa = 0.0f;
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

    public Student setInfo(int x) {
        Scanner c = new Scanner(System.in);
        this.id = x;
        System.out.println("Enter the name = ");
        this.name = c.nextLine();
        System.out.println("Enter the name of the department = ");
        this.dept = c.nextLine();
        System.out.println("Enter Major = ");
        this.major = c.nextLine();
        System.out.println("Enter CGPA = ");
        this.cgpa = c.nextFloat();
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

}
