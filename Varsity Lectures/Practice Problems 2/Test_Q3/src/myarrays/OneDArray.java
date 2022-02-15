/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myarrays;

import java.util.*;

/**
 *
 * @author thinker
 */
public class OneDArray {

    private int[] values;
    private float average;

    OneDArray() {
        // values = new int[4];  
        this.getArray();
    }

    public void getArray() {
        Scanner c = new Scanner(System.in);
        System.out.println("How many Numbers ? ");
        values = new int[c.nextInt()];
        System.out.println("Enter values:");
        for (int i = 0; i < values.length; i++) {
            values[i] = c.nextInt();
        }
    }

    int getlen() {
        return values.length;
    }

    void showArray() {
        for (int i : values) {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }
}
