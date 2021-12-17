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
public class Student {

    private int id;
    private String name;

    public Student(int id,String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString(){
       return "name is "+name+" id is "+id;
    }
}
