package resources;

import java.util.Scanner;
//abstract public class Weapon {
public abstract class Weapon {
//public class Weapon {
    protected String name, dateOfManufacture;
    protected float unitPrice;
    public Weapon setWeapon(){
    //public void setWeapon(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = s.nextLine();
        System.out.print("Enter manufacture date: ");
        dateOfManufacture = s.nextLine();
        System.out.print("Enter unit price: ");
        unitPrice = s.nextFloat();
        return this;
    }   
    public void showWeapon(){
        System.out.println("Name="+name+" ,DateOfManufacture ="
                +dateOfManufacture+", UnitPrice="+unitPrice);
    }
    //public abstract void someAbstractMethod();
    /*
    public void overhaul(){     
        //This code will be useful ONLY for Weapon instances
        //but Weapon instances are not relevant for this application
        //some code UNUSABLE & Unnecessary
    }
    */
    public abstract void overhaul();
    public void doSomething(String str){}
}
