/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users;

import java.io.Serializable;
import utils.Date;

/**
 *
 * @author thinker
 */
public abstract class User implements Serializable {

    public String name, NID, email;
    public Date DateofBirth;

    public User(String name, String NID, String email, Date DOB) {
        this.name = name;
        this.NID = NID;
        this.email = email;
        this.DateofBirth = DOB;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNID() {
        return NID;
    }

    public void setNID(String NID) {
        this.NID = NID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateofBirth() {
        return DateofBirth;
    }

    public void setDateofBirth(Date DateofBirth) {
        this.DateofBirth = DateofBirth;
    }
    
}
