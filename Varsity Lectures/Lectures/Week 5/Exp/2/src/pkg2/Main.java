/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2;

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
        Person[] arr = {new Student(), new Employee()};
        for (Person i : arr) {
            i.Introduce();
        }
    }

}
