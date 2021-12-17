package mainpkg;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import resources.Granade;
import resources.Pistol;
import resources.Sword;
import resources.Weapon;
import users.Person;
import users.Student;


public class MainClass {
    public static void main(String[] args) {
        Student asif = new Student(111, 3.5f, "Asif Ahmed","12/12/20","Male");
        //asif.showStudInfo();
        System.out.println(asif);
        Person farid = new Person("Farid Uddin","10/10/20","Male");
        System.out.println(farid);
        
        /*
        Person p1, p2;
        //p1 = new Person();
        //p1.someAbstractMethod();
        Student std = new Student();
        std.doSome();
        std.someAbstractMethod();
        std.setStudInfo();
        p2 = new Student();
        */
        
        
        //Weapon[] wArr = new Weapon[100];
        //ArrayList<Weapon> wList                 = new ArrayList<Weapon>();
        //Weapon wep = new Weapon();
        //wep.showWeapon();
        //wep.someAbstractMethod();
        //field1=10; non-static field
        Weapon ww = new Pistol();
        ww.someAbstractMethod();
        int ch;
        Scanner s = new Scanner(System.in);
        do{
            System.out.println("Enter [1] to collect a Granade");
            System.out.println("Enter [2] to collect a Pistol");
            System.out.println("Enter [3] to collect a Sword");
            System.out.println("Enter [4] to view ALL collected weapons");
            System.out.println("Enter [5] to view collected Granades");
            System.out.println("Enter [6] to view collected Granades");
            System.out.println("Enter [7] to view collected Granades");
            System.out.println("Enter [8] to overhaul the Granades");
            System.out.println("Enter [9] to overhaul the Pistols");
            System.out.println("Enter [10] to overhaul the Swords");
            System.out.println("Enter [11] to exit");
            System.out.print("Enter your choice...");
            ch = s.nextInt();
            switch(ch){
                case 1:
                    //wList.add(new Granade());//fields has no legit values
                    //wList.add(new Granade("h&K","12/12/18",8500f));//parametrized constructor                   
                    //int wListSize = wList.size();
                    //wList.get(wListSize-1).setGranade();
                    //wList.add(new Granade().setGranade());
                    wList.add(new Granade().setWeapon());
                    break;
                case 2:
                    wList.add(new Pistol().setWeapon());
                    break;
                case 3:
                    wList.add(new Sword().setWeapon());
                    break;
                case 4:
                    //for(int i=0; i<wList.size();i++)
                        //wList.get(i).showWeapon();
                    for(Weapon w: wList)    //advance for loop
                        w.showWeapon();
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
            }
        }while(ch !=11);
        
    }    
    /*
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Student();
        
        Student luna = new Student();
        luna.doSome();
        Student asif = new Student(111,3.66f,"Asif","12/12/21","Male");
        //asif.setStudInfo();
        //asif.showStudInfo();
        System.out.println("String equivalent of asif is: "+asif);
        System.out.println(asif);
    }
    */
    
}

