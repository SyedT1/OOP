/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;

import java.util.*;

/**
 *
 * @author USER
 */
public class QAManager extends Manager {

    private int salary;

    public QAManager(String name, String gender, String nationality, int age, int salary) {
        super(name, gender, nationality, age);
        this.salary = salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
    public void showinfo(){
        System.out.println("The QAManager's name is "+getName()+" and this nationality is = "+getNationality()+ " and his salary is "+salary);
    }
}
