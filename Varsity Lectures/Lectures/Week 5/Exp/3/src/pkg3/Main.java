/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3;

import users.*;

/**
 *
 * @author thinker
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Obj arr[] = {new Ice(), new plasticBall()};
        for (Obj I : arr) {
            I.natureonWater();
        }
        for (Obj I : arr) {
            I.natureonAir();
        }
    }

}
