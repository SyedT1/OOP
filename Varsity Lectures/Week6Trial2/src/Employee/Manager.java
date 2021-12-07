/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;

import java.util.*;

/**
 *
 * @author USER
 */
public class Manager {

    private String name, gender, nationality;
    private int age;

    public Manager() {
        name = gender = nationality = "TBA";
        age = -1;
    }

    public Manager(String name, String gender, String nationality, int age) {
        this.name = name;
        this.gender = gender;
        this.nationality = nationality;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getNationality() {
        return nationality;
    }

    public int getAge() {
        return age;
    }
}
