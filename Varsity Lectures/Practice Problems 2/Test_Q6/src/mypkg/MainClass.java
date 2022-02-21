/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypkg;

import java.util.*;

/**
 *
 * @author thinker
 */
public class MainClass {

    private ArrayList<Student> studArr;
    private ArrayList<Float> cgpaTable[];

    MainClass() {
        studArr = new ArrayList();
        cgpaTable = new ArrayList[3];
        for (int i = 0; i < cgpaTable.length; i++) {
            cgpaTable[i] = new <Float>ArrayList();
        }
    }

    private void populateStudArray() {
        Scanner c = new Scanner(System.in);
        int x;
        while (true) {
            System.out.println("Enter # of Student for Entry : ");
            x = c.nextInt();
            if (x > 0 && x <= 45) {
                break;
            } else {
                System.out.println("Doesn't Meet the constraints. Try Again!");
            }
        }
        for (int i = 0; i < x;) {
            System.out.println("Enter Info for Student " + i + " = ");
            System.out.printf("Enter ID: ");
            int ID = c.nextInt();
            boolean notfound = true;
            for (Student A : studArr) {
                if (A.getId() == ID) {
                    notfound = false;
                    System.out.println("ID Already Exists. Try Again");
                    break;
                }
            }
            if (notfound) {
                studArr.add(new Student().setInfo(ID));
                i++;
            }
        }
    }

    private void scanStudArray() {
        int initiate = cgpaTable[0].size() + cgpaTable[1].size() + cgpaTable[2].size();
        for (int i = initiate; i < studArr.size(); i++) {
            float val_N = studArr.get(i).getCgpa();
            int y = val_N < 2.0 ? 0 : val_N < 3.0 ? 1 : 2;
            cgpaTable[y].add(val_N);
        }

    }

    private void displayCgpaTable() {
        System.out.println("Printing the CGPA Table: ");
        for (int i = 0; i < cgpaTable.length; i++) {
            System.out.println("cgpaTable[" + Integer.toString(i) + "] = ");
            for (int j = 0; j < cgpaTable[i].size(); j++) {
                System.out.print(cgpaTable[i].get(j) + ",");
            }
            System.out.println("");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MainClass p = new MainClass();
        while (true) {
            Scanner c = new Scanner(System.in);
            System.out.println("Do you want to do entry:Press 1 to continue or any other number to discontinue");
            int option = c.nextInt();
            if (option == 1) {
                p.populateStudArray();
                p.scanStudArray();
                p.displayCgpaTable();
            } else {
                break;
            }

        }

    }

}
