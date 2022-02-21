/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_q5;

/**
 *
 * @author thinker
 */
public class Test_Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arr3[][][] = new int[2][][];
        arr3[0] = new int[4][];
        arr3[1] = new int[1][];
        int i = 0;
        for (i = 0; i < 3; i++) {
            arr3[0][i] = new int[2];
        }
        arr3[0][i] = new int[3];
        arr3[1][0] = new int[4];
        for (int j = 0; j < arr3.length; j++) {
            int inc = j > 0 ? 1 : 10, load = 0;
            for (int k = 0; k < arr3[j].length; k++) {
                for (int l = 0; l < arr3[j][k].length; l++) {
                    load += inc;
                    arr3[j][k][l] = load;
                }
            }
        }
        for (int j = 0; j < arr3.length; j++) {
          
            for (int k = 0; k < arr3[j].length; k++) {
                for (int l = 0; l < arr3[j][k].length; l++) {
                    System.out.printf(arr3[j][k][l]+",");
                }
            }
            System.out.println("");
        }

    }

}
