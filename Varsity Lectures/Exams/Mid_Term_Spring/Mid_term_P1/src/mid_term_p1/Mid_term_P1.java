/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mid_term_p1;

import java.util.*;

/**
 *
 * @author thinker
 */
class IntArray {

    private int[] vals;

    IntArray(int spc) {
        vals = new int[spc];
        Random c = new Random();
        for(int i = 0;i<vals.length;i++){
            vals[i] = c.nextInt(10);
        }
        
    }
    public void showIntArray(){
        for(int i:vals){
            System.out.printf(i+" ");
        }
        System.out.println("");
    }
    public void merge(IntArray x){
        int[] mrg = new int[x.vals.length+this.vals.length];
        int k = 0;
        for(int i = 0;i<this.vals.length;i++){
            mrg[k] = this.vals[i];
            k++;
        }
        for(int i = 0;i<x.vals.length;i++){
            mrg[k++] = x.vals[i];
        }
        this.vals = mrg;
    }
}

public class Mid_term_P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IntArray arr1 = new IntArray(3);
        IntArray arr2 = new IntArray(4);
        System.out.printf("arr1 before merge: ");
        arr1.showIntArray();
        System.out.printf("arr2 before merge: ");
        arr2.showIntArray();
        arr1.merge(arr2);
        System.out.printf("arr1, AFTER merged with arr2: ");
        arr1.showIntArray();
    }

}
