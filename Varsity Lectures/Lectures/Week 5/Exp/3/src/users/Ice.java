/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users;

/**
 *
 * @author thinker
 */
public class Ice extends Obj {

    @Override
    public void natureonWater() {
        System.out.println("Ice submerges on Water");
    }
    @Override
    public void natureonAir(){
        System.out.println("Ice does nothing on Air");
    }
}
