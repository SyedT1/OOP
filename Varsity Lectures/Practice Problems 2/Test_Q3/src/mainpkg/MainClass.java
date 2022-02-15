/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpkg;

import myarrays.*;
import java.util.*;

/**
 *
 * @author thinker
 */
public class MainClass {

    public static void main(String[] args) {
        Matrix m1, m2, m3;
        Scanner c = new Scanner(System.in);
        System.out.println("Enter the # of rows = ");
        int rows = c.nextInt();
        System.out.println("Enter the # of cols = ");
        int cols = c.nextInt();
        m1 = new Matrix(rows,cols);
        System.out.println("First Matrix:");
        m1.showMatrix();
    }
}
