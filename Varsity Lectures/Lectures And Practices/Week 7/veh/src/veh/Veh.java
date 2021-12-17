/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veh;
import java.lang.*;
import java.util.*;
import usr.*;
/**
 *
 * @author thinker
 */
public class Veh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SportsCar tesla = new SportsCar(1000,"rear wing spoiler", "car","tesla", "US12033");
        System.out.println(tesla.show());
    }
    
}
