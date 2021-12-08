package mainpkg;

import java.util.Random;
import java.util.Scanner;
import users.Student;


public class MainClass {
    public static void main(String[] args) {
        //Student asif = new Student();
        Student asif = new Student(111,3.66f,"Asif","12/12/21","Male");
        //asif.setStudInfo();
        asif.showStudInfo();
    }
}

