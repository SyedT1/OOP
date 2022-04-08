/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author thinker
 */
public class Passport {
    private String passportNo;
    private Address placeofissue;
    private Date dateofissue,dateofexpiry;

    public String getPassportNo() {
        return passportNo;
    }

    public void setPassportNo(String passportNo) {
        this.passportNo = passportNo;
    }

    public Address getPlaceofissue() {
        return placeofissue;
    }

    public void setPlaceofissue(Address placeofissue) {
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
