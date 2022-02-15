/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myarrays;

/**
 *
 * @author thinker
 */
public class Matrix {

    private OneDArray[][] arrays;

    public Matrix(int rows, int cols) {
        arrays = new OneDArray[rows][];
        for (int i = 0; i < arrays.length; i++) {
            System.out.println("Enter the # of cols for the " + Integer.toString(i + 1) + "-th row = ");
            arrays[i] = new OneDArray[cols];
            for (int j = 0; j < arrays[i].length; j++) {
                arrays[i][j] = new OneDArray();
            }
        }
    }

    public void showMatrix() {
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                arrays[i][j].showArray();
            }
        }
    }
}
