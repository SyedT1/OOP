/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wpn;

/**
 *
 * @author thinker
 */
public class Swrd extends Weapon {
    private String name,origin;

    public Swrd setName(String name) {
        this.name = name;
        return this;
    }

    public Swrd setOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    public String getName() {
        return name;
    }

    public String getOrigin() {
        return origin;
    }
    
    @Override
    public void overhaul(){
        System.out.println("Sword cleaned");
    }
}
