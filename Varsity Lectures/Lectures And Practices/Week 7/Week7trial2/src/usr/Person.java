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
abstract public class Person {
    private int age,id;
    private String name;
    public Person setall(String name,int age,int id){
        this.name = name;
        this.age = age;
        this.id = id;
        return this;
    }
    public void viewall(){
        System.out.println(name + " "+id+" "+age);
       // return this;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract void meeting();
}
