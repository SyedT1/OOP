package users;

//abstract public class Person {
public abstract class Person {
//public class Person {
    //private String name, dob, gender;
    protected String name, dob, gender;

    public Person() {
    }

    public Person(String name, String dob, String gender) {
        this.name = name;
        this.dob = dob;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public void doSome(){ System.out.println("doSome in Person");}
    //public abstract void someAbstractMethod(){}
    //public abstract void someAbstractMethod();
}