/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7trial;

import java.util.*;
import wpn.*;

/**
 *
 * @author thinker
 */
public class Week7trial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Weapon> wp = new ArrayList();
        Scanner n = new Scanner(System.in);
        //PUBG Game
        System.out.println("How many weapons do you want to purchase = ");
        int lpnum = n.nextInt();
        for (int i = 0; i < lpnum; i++) {
            System.out.println("1.Do you want a grenade ? ");
            System.out.println("2.Do you want a pistol ?");
            System.out.println("3.Do you want a sword ?");
            int x = n.nextInt();
            switch (x) {
                case 1:
                    wp.add(new Grnde().setName("S").setReg("1000"));
                    break;
                case 2:
                    wp.add(new Pstol().setName("RK").setReg("1222"));
                    break;
                case 3:
                    wp.add(new Swrd().setName("Yh").setOrigin("Japan"));
                    break;
            }
        }
        for (Weapon chk:wp) {
            if (chk instanceof Grnde) {
                System.out.println(((Grnde) chk).getName() + " " + ((Grnde) chk).getReg());
            } else if (chk instanceof Pstol) {
                System.out.println(((Pstol) chk).getName() + " " + ((Pstol) chk).getReg());
            } else if (chk instanceof Swrd) {
                System.out.println(((Swrd) chk).getName() + " " + ((Swrd) chk).getOrigin());
            }
        }
    }

}
