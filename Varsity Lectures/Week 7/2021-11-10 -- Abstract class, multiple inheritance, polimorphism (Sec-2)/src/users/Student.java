package users;

import mainpkg.*;
import java.util.Scanner;
import myinterfaces.Insurable;
import myinterfaces.Taxable;

public class Student extends Person{ // implements Taxable, Insurable{
    private int id;
    private float cgpa;

    public Student(){}
    
    /*
    public Student(int id, float cgpa, String name, String dob, String gender) {
	this.id = id;
	this.cgpa = cgpa;
	this.name = name;
	this.dob = dob;
	this.gender = gender;
    }
    */

    public Student(int id, float cgpa, String name, String dob, String gender) {
	//Person(name,dob,gender);
        super(name,dob,gender);
        this.id = id;
	this.cgpa = cgpa;
	//this.name = name;
	//this.dob = dob;
	//this.gender = gender;
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
    /*
    //subclass method is unable to access inherited 
    //private fields from superclass
    public void setStudInfo(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter id: ");
        id = s.nextInt();
        s.nextLine();
        System.out.print("Enter name: ");
        name = s.nextLine();
        System.out.print("Enter date of birth: ");
        dob = s.nextLine();
        System.out.print("Enter gender: ");
        gender = s.nextLine();        
        System.out.print("Enter cgpa: ");
        cgpa = s.nextFloat();
    }
    */
    
    //subclass method needs to use getter/setter of superclass 
    //to read/write inherited private field values
    public void setStudInfo(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter id: ");
        id = s.nextInt();
        s.nextLine();
        System.out.print("Enter name: ");
        setName( s.nextLine() );
        System.out.print("Enter date of birth: ");
        setDob( s.nextLine() );
        System.out.print("Enter gender: ");
        setGender( s.nextLine() );
        System.out.print("Enter cgpa: ");
        cgpa = s.nextFloat();
    }
    
    /*
    //subclass method is unable to access inherited 
    //private fields from superclass
    public void showStudInfo(){
        //System.out.println("Showing student info...");
        System.out.println("id="+id+", Name="+name+", Cgpa="+cgpa);
    }
    */

    //subclass method needs to use getter/setter of superclass 
    //to read/write inherited private field values    
    public void showStudInfo(){
        //System.out.println("Showing student info...");
        System.out.println("id="+id+", Name="+getName()+
                ", DateOfBirth="+getDob()+
                ", Gender="+getGender()+", Cgpa="+cgpa);
    }
    /*
    @Override
    public String toString(){
        return "id="+id+", Name="+getName()+
                ", DateOfBirth="+getDob()+
                ", Gender="+getGender()+", Cgpa="+cgpa;
    }
    */

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ",name="+name+
                ",dateOfBirth="+dob+",gender="+gender+
                ", cgpa=" + cgpa + '}';
    }
    
    
    @Override
    public void doSome(){ System.out.println("doSome in Student");}
    
    //public void doSome(){ System.out.println("doSome version1");}
    
    @Override
    public void someAbstractMethod(){
        System.out.println("soAbstractMethod is executed");
    }
}
