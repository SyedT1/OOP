/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users;

import java.util.*;

/**
 *
 * @author thinker
 */
public abstract class Person {

    private String name;
    private int age;

    public Person() {

    }

    public void setNameAge() {
        Scanner c = new Scanner(System.in);
        System.out.println("Enter Name: ");
        name = c.nextLine();
        System.out.println("Enter Age: ");
        age = c.nextInt();
    }
    @Override
    public String toString() {
        return "the name is = " + name + ", and age is  = " + Integer.toString(age);
    }
    public abstract void Introduce();
}
