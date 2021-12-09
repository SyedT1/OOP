package resources;

import java.util.Scanner;

public class Granade extends Weapon{
    
    //public void setGranade(){
    /*
    public Granade setGranade(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = s.nextLine();
        System.out.print("Enter manufacture date: ");
        dateOfManufacture = s.nextLine();
        System.out.print("Enter unit price: ");
        unitPrice = s.nextFloat();
        return this;
    }
    */
    
    @Override
    public void showWeapon(){
        System.out.println("Granade Name="+name+" ,DateOfManufacture ="
                +dateOfManufacture+", UnitPrice="+unitPrice);
    }
    
    
    @Override
    public void overhaul(){
        System.out.println("Granade  "+name+" is overhauled");
    }
    
    public void doSomething(){}
    public void doSomething(int x){}
    
}
