/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6trial3;

import java.util.*;
import checkprime.*;

/**
 *
 * @author USER
 */
public class Week6Trial3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner c = new Scanner(System.in);
        int n = c.nextInt();
        int arr[] = new int[n];
        boolean vis[] = new boolean[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;

        }
        CheckPrime t = new CheckPrime();
        vis = t.checkprime(arr);
        int counter = 0;
        for (int i = 0; i < n; i++) {
            if (vis[i] == false) {
                System.out.println("Prime " + counter + " is " + i);
                counter++;
            }
        }
    }

}
