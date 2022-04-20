/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpkg;

import java.io.Serializable;

/**
 *
 * @author thinker
 */
public class Student implements Serializable{

    private String id, name, cgpa;

    public Student(String id, String name, String cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCgpa() {
        return cgpa;
    }

    public void setCgpa(String cgpa) {
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {
        return "ID is" + id + ",name is = " + name + ",cgpa is = " + cgpa;
    }
}
