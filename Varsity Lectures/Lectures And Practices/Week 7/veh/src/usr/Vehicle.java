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
public class Vehicle {

    private String type;

    public Vehicle(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
    public String show(){
        return "Type of the vehicle is = "+type;
    }
}
