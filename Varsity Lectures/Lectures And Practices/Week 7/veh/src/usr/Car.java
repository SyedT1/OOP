/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usr;

/**
 *
 * @author thinker
 */
public class Car extends Vehicle {
    private String brand,reg;
    Car(String type,String brand,String reg){
        super(type);
        this.brand = brand;
        this.reg = reg;
    }

    public String getBrand() {
        return brand;
    }

    public String getReg() {
        return reg;
    }
    public String show(){
        return "Brand of the Car is "+brand+" and the reg no. is "+reg;
    }
}
