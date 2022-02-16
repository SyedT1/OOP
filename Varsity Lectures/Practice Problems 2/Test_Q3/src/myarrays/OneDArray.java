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
    OneDArray() { }

    OneDArray(int size,int up_lm) {
        Random r = new Random();
      //  Scanner c = new Scanner(System.in);
        values = new int[size];
        average = 0.0f;
        //System.out.println("Enter values:");
        for (int i = 0; i < values.length; i++) {
            values[i] = r.nextInt(up_lm);
            average += values[i];
        }
        average /= values.length;
    }
    public int[] Arr(){
        return values;
    }
    public void getArray() {
        Scanner c = new Scanner(System.in);
        System.out.println("How many Numbers ? ");
        values = new int[c.nextInt()];
        average = 0.0f;
        System.out.println("Enter values:");
        for (int i = 0; i < values.length; i++) {
            values[i] = c.nextInt();
            average += values[i];
        }
        average /= values.length;
    }
    public void setArray(int A[],int B[]){
        this.values = new int[A.length+B.length];
        int k = 0;
        average = 0.0f;
        for(int i = 0;i<values.length;i++){
            if(i<A.length){
                this.values[i] = A[i];
            }else{
                this.values[i] = B[k++];
            }
            average += this.values[i];
        }
        average /= values.length;
    }
    int getlen() {
        return values.length;
    }

    void showArray() {
        float avg = 0.0f;
        System.out.printf("{");
        for (int i = 0; i < values.length; i++) {
            avg += values[i];
            System.out.printf("%d", values[i]);
            if (i < values.length - 1) {
                System.out.printf(",");
            }

        }
        System.out.printf("} Avg:" + average + "\t");
    }
}
