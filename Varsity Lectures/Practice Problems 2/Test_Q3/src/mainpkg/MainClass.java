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
        m1 = new Matrix(rows, cols);
        System.out.println("First Matrix:");
        m1.showMatrix();
        m2 = new Matrix(rows, cols, 2, 10);
        System.out.println("Second Matrix:");
        m2.showMatrix();
        m3 = new Matrix();
        m3 = m1.merge(m2);
        System.out.println("Merged Matrix:");
        m3.showMatrix();
    }
}
