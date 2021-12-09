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
public class SportsCar extends Car {

    private int cc;
    private String spoiler;

    public SportsCar(int cc, String spoiler, String type, String brand, String reg) {
        super(type, brand, reg);
        this.cc = cc;
        this.spoiler = spoiler;
    }
    @Override
    public String show(){
        return "CC is "+cc+" and the brand is "+super.getBrand()+" of the type "+super.getType();
    }
}
