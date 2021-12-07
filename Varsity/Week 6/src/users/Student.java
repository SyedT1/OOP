/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users;

/**
 *
 * @author USER
 */
public class Student extends Person {

    private int id;
    private float cgpa;
    String department;

    public Student(String name, String nationality, String bg, int id, float cgpa, String department) {
        super(name, nationality, bg);
        this.id = id;
        this.cgpa = cgpa;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public void showinfo(){
        System.out.println("The name of the student is = "+getName()+" and the id is = "+id+" and the blood group is "+getBloodgroup());
    }
    
}
