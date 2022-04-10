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

    private String passportNo, passportType;
    private String placeofissue;
    private Date dateofissue, dateofexpiry;

    public Passport(String passportNo, String placeofissue, Date dateofissue, Date dateofexpiry, String passportType) {
        this.passportNo = passportNo;
        this.placeofissue = placeofissue;
        this.dateofissue = dateofissue;
        this.dateofexpiry = dateofexpiry;
        this.passportType = passportType;
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
