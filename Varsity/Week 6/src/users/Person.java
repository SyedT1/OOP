/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users;

import java.util.*;

/**
 *
 * @author USER
 */
public class Person {

    private String name, nationality, bloodgroup;

    Person() {
        name = nationality = bloodgroup = "TBA";
    }

    Person(String name, String nationality, String bg) {
        this.name = name;
        this.nationality = nationality;
        this.bloodgroup = bg;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setBloodgroup(String bloodgroup) {
        this.bloodgroup = bloodgroup;
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public String getBloodgroup() {
        return bloodgroup;
    }
    
}
