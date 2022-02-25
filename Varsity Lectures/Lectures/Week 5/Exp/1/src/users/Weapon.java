/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users;

import utilities.*;
import java.util.*;

/**
 *
 * @author thinker
 */
public abstract class Weapon {

    private String licenseNo;
    private String placeofpurchase;
    private Date_ DateofPurchase;

    public Weapon() {
        DateofPurchase = new Date_();
    }

    public Weapon setWeaponDetails() {
        Scanner c = new Scanner(System.in);
        System.out.println("Enter LicenseNo:");
        licenseNo = c.nextLine();
        System.out.println("Enter placeofPurchase: ");
        placeofpurchase = c.nextLine();
        System.out.println("Enter Date of Purchase: ");
        DateofPurchase.setDay().setMonth().setYear();
        return this;
    }

    public void showWeaponDetails() {
        System.out.println("The License No. is " + licenseNo + "," + " and the place of purchase is " + placeofpurchase + ", and the date is " + DateofPurchase);
    }

    public void noise() {
        System.out.println("Bam Bam");
    }
    // abstract void nature();
}
