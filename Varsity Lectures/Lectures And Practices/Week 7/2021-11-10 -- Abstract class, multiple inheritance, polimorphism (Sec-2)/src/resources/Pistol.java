package resources;

import java.util.Scanner;

public class Pistol extends Weapon{
    /*@Override
    public void someAbstractMethod(){
        //..
    }
    */
    /*
    public Pistol setPistol(){
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
        System.out.println("Pistol Name="+name+" ,DateOfManufacture ="
                +dateOfManufacture+", UnitPrice="+unitPrice);
    } 
    
    
    @Override
    public void overhaul(){
        System.out.println("Pistol "+name+" is overhauled");
    }
    
}
