/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7trial2;

import java.io.PrintStream;
import java.util.*;
import java.lang.*;
import usr.*;

/**
 *
 * @author thinker
 */
public class Week7trial2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random c = new Random();
        String[] names = {"Mark","Twain","Caliber","White","Q","Herbert"};
        Person p = new Student().setall("IUB", "3.9", "IUB", "S", 10, 10);
        p.viewall();
        Person []q = new Person[10];
        for(int i = 0;i<q.length;i++){
            q[i] = new Student().setall("IUB", "3.9", "CS", names[c.nextInt(5)], i, i);
        }
        for(Person i:q){
            i.viewall();
        }
    }

}
