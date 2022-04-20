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
public class VisaOfficer extends User implements Serializable {

    private String loginID, password;

    public VisaOfficer(String name, String sex, String NID, String email, Date DOB, String loginID, String password) {
        super(name, sex, NID, email, DOB);
        this.loginID = loginID;
        this.password = password;
    }

    public String getLoginID() {
        return loginID;
    }

    public void setLoginID(String loginID) {
        this.loginID = loginID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
