/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.*;

/**
 *
 * @author thinker
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random r = new Random();
        /*
        Initializing and using a 3D Array
        int[][][] arr = new int[3][][];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[2][];
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = new int[5];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    arr[i][j][k] = r.nextInt(100);
                }
            }
        }
        for (int i[][] : arr) {
            for (int j[] : i) {
                for (int k : j) {
                    System.out.printf("Element = %d\n", k);
                }
            }
        }*/
 /*
        
        Initializing and using a 4D array
        int[][][][] D4 = new int[4][][][];
        for (int i = 0; i < D4.length; i++) {
            D4[i] = new int[3][][];
        }
        for (int i = 0; i < D4.length; i++) {
            for (int j = 0; j < D4[i].length; j++) {
                D4[i][j] = new int[2][];
            }
        }
        for (int i = 0; i < D4.length; i++) {
            for (int j = 0; j < D4[i].length; j++) {
                for (int k = 0; k < D4[i][j].length; k++) {
                    D4[i][j][k] = new int[1];
                }
            }
        }
        for(int i = 0;i<D4.length;i++){
            for(int j = 0;j<D4[i].length;j++){
                for(int k = 0;k<D4[i][j].length;k++){
                    for(int l = 0;l<D4[i][j][k].length;l++){
                        D4[i][j][k][l]=r.nextInt(100);
                    }
                }
            }
        }
        for(int i[][][]:D4){
            for(int j[][]:i){
                for(int k[]:j){
                    for(int l:k){
                        System.out.printf("%d,",l);
                    }
                }
            }
        }*/
        int[][][][][] D5 = new int[5][][][][];
        for (int i = 0; i < D5.length; i++) {
            D5[i] = new int[4][][][];
        }
        for (int i = 0; i < D5.length; i++) {
            for (int j = 0; j < D5[i].length; j++) {
                D5[i][j] = new int[3][][];
                for (int k = 0; k < D5[i][j].length; k++) {
                    D5[i][j][k] = new int[2][];
                    for (int l = 0; l < D5[i][j][k].length; l++) {
                        D5[i][j][k][l] = new int[1];
                        for (int m = 0; m < D5[i][j][k][l].length; m++) {
                            D5[i][j][k][l][m] = r.nextInt(100);
                        }
                    }
                }
            }
        }
        for (int i[][][][] : D5) {
            for (int j[][][] : i) {
                for (int k[][] : j) {
                    for (int l[] : k) {
                        for (int m : l) {
                            System.out.printf("Element is %d\n", m);
                        }
                    }
                }
            }
        }
    }

}
