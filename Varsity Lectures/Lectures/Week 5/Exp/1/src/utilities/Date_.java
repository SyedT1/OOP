/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import java.util.*;

/**
 *
 * @author thinker
 */
public class Date_ {

    private int day, month, year;
    public Date_(){
        
    }
    public Date_(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date_ setDay() {
        System.out.println("Enter Day: ");
        day = new Scanner(System.in).nextInt();
        return this;
    }

    public Date_ setMonth() {
        System.out.println("Enter Month: ");
        month = new Scanner(System.in).nextInt();
        return this;
    }

    public void setYear() {
        System.out.println("Enter Year: ");
        year = new Scanner(System.in).nextInt();
    }

    @Override
    public String toString() {
        return Integer.toString(day) + "." + Integer.toString(month) + "." + Integer.toString(year);
    }
}
