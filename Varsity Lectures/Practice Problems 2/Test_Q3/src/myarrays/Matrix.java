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
public class Matrix {

    private OneDArray[][] arrays;

    public Matrix() {

    }

    public Matrix(int rows, int cols) {
        arrays = new OneDArray[rows][];
        for (int i = 0; i < arrays.length; i++) {
            System.out.println("Enter the # of cols for the " + Integer.toString(i) + "-th row = ");
            arrays[i] = new OneDArray[cols];
            for (int j = 0; j < arrays[i].length; j++) {
                System.out.println("M[" + Integer.toString(i) + "]" + "[" + Integer.toString(j) + "] = ");
                arrays[i][j] = new OneDArray();
                arrays[i][j].getArray();
            }
        }
    }

    public Matrix(int rows, int cols, int initial_size, int upper_lmit) {
        Random c = new Random();
        arrays = new OneDArray[rows][];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = new OneDArray[cols];
            for (int j = 0; j < arrays[i].length; j++) {
                //   System.out.println("M[" + Integer.toString(i) + "]" + "[" + Integer.toString(j) + "] = ");
                arrays[i][j] = new OneDArray(initial_size, upper_lmit);
            }
            initial_size++;
        }
    }

    public void showMatrix() {
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                arrays[i][j].showArray();
            }
            System.out.println("");
        }
    }

    public Matrix merge(Matrix A) {
        Matrix m3 = new Matrix();
        m3.arrays = new OneDArray[this.arrays.length][];
        for (int i = 0; i < m3.arrays.length; i++) {
            m3.arrays[i] = new OneDArray[this.arrays[0].length];
            for(int j = 0;j<m3.arrays[i].length;j++){
                m3.arrays[i][j] = new OneDArray();
                m3.arrays[i][j].setArray(this.arrays[i][j].Arr(),A.arrays[i][j].Arr());
            }
        }
        return m3;
    }
}
