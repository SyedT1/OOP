/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usrs_utls;

/**
 *
 * @author thinker
 */
public class Student {
    Calculator a;
    public Student(){
        a = new Calculator();
    }
    public void add(int x,int y){
        System.out.println(a.add(x, y));
    }
   
}
