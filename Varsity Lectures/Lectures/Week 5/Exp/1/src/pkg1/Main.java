/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;

import users.*;
import java.util.*;

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
        ArrayList<Weapon> GameA = new ArrayList<Weapon>();
        GameA.add(new Pistol());
        GameA.add(new Machine_Gun());
        for (Weapon I : GameA) {
            I.setWeaponDetails().showWeaponDetails();
        }
        for(Weapon I:GameA){
            I.noise();
        }
    }

}
