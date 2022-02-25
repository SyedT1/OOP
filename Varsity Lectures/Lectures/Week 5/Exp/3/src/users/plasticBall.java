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
public class plasticBall extends Obj{
    @Override
    public void natureonWater(){
        System.out.println("Plastic ball floats on water");
    }
    @Override
    public void natureonAir(){
        System.out.println("Plastic ball flies on Air");
    }
}
