/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import users.*;

/**
 *
 * @author thinker
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student Asif = new Student(1830032, "Rafiq");
        //System.out.println(Asif.getClass().getName()+'@'+Integer.toHexString(Asif.hashCode()));
        System.out.println(Asif);
    }

}
