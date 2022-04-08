/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users;

import java.io.Serializable;
import utils.Address;
import utils.Date;
import utils.Passport;

/**
 *
 * @author thinker
 */
public class VisaApplicant extends User implements Serializable {
    private String CurrentLocation,FirstName,LastName,PermanentAddress,BirthCountry;
    private Address permanentAddress;
    private boolean MaritalStatus;
    private Passport passportInfo;
    private Date tentativeDateOfArrival;
    public VisaApplicant(String name, String NID, String email, Date DOB) {
        super(name, NID, email, DOB);
    }
}
