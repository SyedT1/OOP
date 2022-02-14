/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_q2;

import java.util.*;

/**
 *
 * @author thinker
 */
class MyArray {

    int[] intData;

    MyArray() {
        Scanner v = new Scanner(System.in);
        intData = new int[v.nextInt()];
    }

    public String toString() {
        String res = new String();
        for (int i = 0; i < intData.length; i++) {
            res += Integer.toString(intData[i]) + ' ';
        }
        return res + '\n';
    }
}

class Matrix {

    MyArray[][] oneDObjects;

    Matrix() {
        oneDObjects = new MyArray[0][];
    }

    public void populateAndAugment() {
        Scanner c = new Scanner(System.in);
        if (oneDObjects.length == 0) {
            System.out.println("Enter # of rows = ");
            oneDObjects = new MyArray[c.nextInt()][];
            for (int i = 0; i < oneDObjects.length; i++) {
                System.out.println("Enter # of cols = ");
                oneDObjects[i] = new MyArray[1];
                oneDObjects[i][0] = new MyArray();
                for (int j = 0; j < oneDObjects[i][0].intData.length; j++) {
                    System.out.println("Input value for [" + Integer.toString(i) + "][" + Integer.toString(j) + "] = ");
                    oneDObjects[i][0].intData[j] = c.nextInt();
                }
            }
        } else {
            System.out.println("Enter # of rows = ");
            int row = c.nextInt();
            MyArray[][] N = new MyArray[row + oneDObjects.length][];
            for (int i = 0; i < oneDObjects.length; i++) {
                N[i] = oneDObjects[i];
            }
            for (int i = oneDObjects.length; i < row + oneDObjects.length; i++) {
                System.out.println("Enter # of cols = ");
                N[i] = new MyArray[1];
                N[i][0] = new MyArray();
                for (int j = 0; j < N[i][0].intData.length; j++) {
                    System.out.println("Input value for [" + Integer.toString(i) + "][" + Integer.toString(j) + "] = ");
                    N[i][0].intData[j] = c.nextInt();
                }
            }
            oneDObjects = N;
        }

    }

    public void display() {
        for (int i = 0; i < oneDObjects.length; i++) {
            System.out.println("For Row # " + Integer.toString(i + 1) + ":");
            System.out.println(oneDObjects[i][0]);
        }
    }
}

public class Test_Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Matrix m = new Matrix();
        Scanner c = new Scanner(System.in);
        while (true) {
            System.out.println("Populate Matrix? Enter 1 for Yes : 2 for No ");
            int option = c.nextInt();
            if (option == 2) {
                break;
            } else if (option != 1) {
                System.out.println("Wrong input. Try Again");
                continue;
            }
            m.populateAndAugment();
            m.display();
        }
    }

}
