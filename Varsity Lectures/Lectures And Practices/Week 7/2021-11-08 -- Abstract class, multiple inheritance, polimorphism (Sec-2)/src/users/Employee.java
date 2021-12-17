package users;

import myinterfaces.Taxable;

public class Employee extends Person implements Taxable{
    private int empId;
    private String desig, dept;
    private float Salary;
    
    @Override
    public float calcTaxAmount(){
        float taxAmount=0.0f;
        //taxAmount = ....;
        return taxAmount;
    }
    
}
