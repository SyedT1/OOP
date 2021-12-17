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
public class Student extends Person {

    private String institution, cgpa, dept;
    public Student setall(String institution, String cgpa, String dept, String name, int age, int id) {
        super.setall(name, age, id);
        this.institution = institution;
        this.cgpa = cgpa;
        this.dept = dept;
        return this;
    }
    
    @Override
    public void viewall(){
        System.out.println(super.getName()+" "+super.getAge()+" "+super.getId());
    //    return this;
    }
    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getCgpa() {
        return cgpa;
    }

    public void setCgpa(String cgpa) {
        this.cgpa = cgpa;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
    @Override
    public void meeting(){
        System.out.println("Students are expected to join the meeting today at 7pm");
    }

  
}
