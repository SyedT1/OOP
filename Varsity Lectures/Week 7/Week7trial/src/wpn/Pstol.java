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
public class Pstol extends Weapon {
    private String name,reg;

    public Pstol setName(String name) {
        this.name = name;
        return this;
    }

    public Pstol setReg(String reg) {
        this.reg = reg;
        return this;
    }

    public String getName() {
        return name;
    }

    public String getReg() {
        return reg;
    }
    
    @Override
    public void overhaul(){
        System.out.println("Cleaned Pstol");
    }
}
