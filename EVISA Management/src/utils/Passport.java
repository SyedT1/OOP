/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.io.Serializable;

/**
 *
 * @author thinker
 */
public class Passport implements Serializable{

    public String passportNo, passportType;
    public String placeofissue,NID;
    public Date dateofissue, dateofexpiry;

    public Passport(String passportNo, String placeofissue, Date dateofissue, Date dateofexpiry, String passportType,String NID) {
        this.passportNo = passportNo;
        this.placeofissue = placeofissue;
        this.dateofissue = dateofissue;
        this.dateofexpiry = dateofexpiry;
        this.passportType = passportType;
        this.NID = NID;
    }

    public String getNID() {
        return NID;
    }

    public String getPassportNo() {
        return passportNo;
    }

    public void setPassportNo(String passportNo) {
        this.passportNo = passportNo;
    }

    public String getPlaceofissue() {
        return placeofissue;
    }

    public void setPlaceofissue(String placeofissue) {
        this.placeofissue = placeofissue;
    }

    public Date getDateofissue() {
        return dateofissue;
    }

    public void setDateofissue(Date dateofissue) {
        this.dateofissue = dateofissue;
    }

    public Date getDateofexpiry() {
        return dateofexpiry;
    }

    public void setDateofexpiry(Date dateofexpiry) {
        this.dateofexpiry = dateofexpiry;
    }

}
