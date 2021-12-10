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
public class Student {
    //non-static but final
    final int id;
    public Student(final int id){
        this.id = id;
    }
    public void show(){
        System.out.println("Id of the student is "+id);
    }
}
