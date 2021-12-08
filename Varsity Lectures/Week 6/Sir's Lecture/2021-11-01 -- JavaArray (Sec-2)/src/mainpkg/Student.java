package mainpkg;

import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private float cgpa;

    public Student() {

    }

    public Student(int id, String name, float cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
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

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }
    
    public void setStudInfo(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter id: ");
        id = s.nextInt();
        s.nextLine();
        System.out.print("Enter name: ");
        name = s.nextLine();
        System.out.print("Enter cgpa: ");
        cgpa = s.nextFloat();
    }

    public void showStudInfo(){
        //System.out.println("Showing student info...");
        System.out.print("id="+id+", Name="+name+", Cgpa="+cgpa);
    }
}
