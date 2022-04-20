/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import utils.Date;

/**
 *
 * @author thinker
 */
public abstract class User implements Serializable {

    protected String name, NID, email, sex;
    protected Date DateofBirth;

    public User(String name, String sex, String NID, String email, Date DOB) {
        this.name = name;
        this.NID = NID;
        this.email = email;
        this.sex = sex;
        this.DateofBirth = DOB;
    }

    public static User verifylogin(String usertype, String loginID, String password) {
        File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        User u = null;
        try {
            String slow = usertype + "Login.bin";
            System.out.println(slow);
            f = new File(slow);
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            if (usertype.equals("VisaOfficer")) {
                try {
                    VisaOfficer v;
                    while (true) {
                        v = (VisaOfficer) ois.readObject();
                        if (v.getLoginID().equals(loginID) && v.getPassword().equals(password)) {
                            u = v;
                            return u;
                        }

                    }
                }//end of nested try
                catch (Exception e) {
                    System.out.println(e);
                    //
                }//nested catch     
            } else if (usertype.equals("VisaApplicant")) {
                try {
                    VisaApplicant v;
                    while (true) {
                        v = (VisaApplicant) ois.readObject();
                        if (v.getLoginID().equals(loginID) && v.getPassword().equals(password)) {
                            u = v;
                            return u;
                        }

                    }
                }//end of nested try
                catch (Exception e) {
                    System.out.println(e);
                    //
                }//n

            }
        } catch (IOException ex) {
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException ex) {
            }
        }
        return u;
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

    public String getDateofBirth() {
        return DateofBirth.toString();
    }

    public void setDateofBirth(Date DateofBirth) {
        this.DateofBirth = DateofBirth;
    }

}
