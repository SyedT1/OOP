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
public class Grnde extends Weapon {

    private String reg, name;

    public Grnde setReg(String reg) {
        this.reg = reg;
        return this;
    }

    public Grnde setName(String name) {
        this.name = name;
        return this;
    }

    public String getReg() {
        return reg;
    }

    public String getName() {
        return name;
    }
    
    @Override
    public void overhaul() {
        System.out.println("Grnde is cleaned");
    }
}
