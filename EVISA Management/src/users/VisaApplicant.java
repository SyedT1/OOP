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

    private String currentLocation, firstName, lastName, birthCountry, bdvisaofficelocation;
    private String maritalStatus, occupation, presentNationality;
    private Address permanentAddress;
    private Date tentativeDateOfArrival;
    private String typeofVisa, typeofVisaEnrollment, passportNo;
    public Passport p;
    private String LoginID, password;

    public VisaApplicant(String currentLocation, String firstName, String lastName, String birthCountry, String sex, String bdvisaofficelocation, String maritalStatus, String occupation, String presentNationality, Address permanentAddress, Date DOB, Date tentativeDateOfArrival, String typeofVisa, String typeofVisaEnrollment, String NID, String email, Passport p, String LoginID, String password, String passportNo) {
        super(firstName + " " + lastName, sex, p.getNID(), email, DOB);
        this.firstName = firstName;
        this.lastName = lastName;
        this.maritalStatus = maritalStatus;
        this.currentLocation = currentLocation;
        this.birthCountry = birthCountry;
        this.occupation = occupation;
        this.presentNationality = presentNationality;
        this.permanentAddress = permanentAddress;
        this.typeofVisaEnrollment = typeofVisaEnrollment;
        this.p = p;
        this.typeofVisa = typeofVisa;
        this.tentativeDateOfArrival = tentativeDateOfArrival;
        this.bdvisaofficelocation = bdvisaofficelocation;
        this.LoginID = LoginID;
        this.password = password;
        this.passportNo = passportNo;
    }

    public VisaApplicant(String currentLocation, String firstName, String lastName, String birthCountry, String sex, String bdvisaofficelocation, String maritalStatus, String occupation, String presentNationality, Address permanentAddress, Date DOB, Date tentativeDateOfArrival, String typeofVisa, String typeofVisaEnrollment, String NID, String email, Passport p, String passportNo) {
        super(firstName + " " + lastName, sex, p.getNID(), email, DOB);
        this.firstName = firstName;
        this.lastName = lastName;
        this.maritalStatus = maritalStatus;
        this.currentLocation = currentLocation;
        this.birthCountry = birthCountry;
        this.occupation = occupation;
        this.presentNationality = presentNationality;
        this.permanentAddress = permanentAddress;
        this.typeofVisaEnrollment = typeofVisaEnrollment;
        this.p = p;
        this.typeofVisa = typeofVisa;
        this.tentativeDateOfArrival = tentativeDateOfArrival;
        this.bdvisaofficelocation = bdvisaofficelocation;
        this.passportNo = passportNo;
        // this.DOB = DOB;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthCountry() {
        return birthCountry;
    }

    public void setBirthCountry(String birthCountry) {
        this.birthCountry = birthCountry;
    }

    public String getBdvisaofficelocation() {
        return bdvisaofficelocation;
    }

    public void setBdvisaofficelocation(String bdvisaofficelocation) {
        this.bdvisaofficelocation = bdvisaofficelocation;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getPresentNationality() {
        return presentNationality;
    }

    public void setPresentNationality(String presentNationality) {
        this.presentNationality = presentNationality;
    }

    public Address getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(Address permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public Date getTentativeDateOfArrival() {
        return tentativeDateOfArrival;
    }

    public void setTentativeDateOfArrival(Date tentativeDateOfArrival) {
        this.tentativeDateOfArrival = tentativeDateOfArrival;
    }

    public String getTypeofVisa() {
        return typeofVisa;
    }

    public void setTypeofVisa(String typeofVisa) {
        this.typeofVisa = typeofVisa;
    }

    public String getTypeofVisaEnrollment() {
        return typeofVisaEnrollment;
    }

    public void setTypeofVisaEnrollment(String typeofVisaEnrollment) {
        this.typeofVisaEnrollment = typeofVisaEnrollment;
    }

    public Passport getP() {
        return p;
    }

    public void setP(Passport p) {
        this.p = p;
    }

    public String getLoginID() {
        return LoginID;
    }

    public void setLoginID(String LoginID) {
        this.LoginID = LoginID;
    }

    public String getPassportNo() {
        return passportNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Name is = " + firstName + lastName + "\n"
                + "Sex is = " + this.sex + "\n"
                + "NID is = " + this.NID + "\n"
                + "Email is = " + this.email + "\n"
                + "DOB is = " + this.DateofBirth;
    }
}
