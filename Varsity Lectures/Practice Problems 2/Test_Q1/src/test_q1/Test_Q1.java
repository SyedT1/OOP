package test_q1;
import java.util.ArrayList;
import java.util.Scanner;

class Complex {

    int real, img;

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        System.out.println("Enter the Real value of the complex Number = ");
        this.real = real;
    }

    public int getImg() {
        return img;
    }

    public Complex setComplex() {
        Scanner c = new Scanner(System.in);
        Complex dummy = new Complex();
        System.out.println("Enter the real value = ");
        dummy.real = c.nextInt();
        System.out.println("Enter the imaginary value = ");
        dummy.img = c.nextInt();
        return dummy;
    }

    public void setImg(int img) {
        System.out.println("Enter the imaginary value of the complex number = ");
        this.img = img;
    }

}

class ComplexList {

    ArrayList<Complex> cList;

    ComplexList() {
        cList = new ArrayList();
    }

    public void add(Complex a) {
        cList.add(a);
    }
    @Override
    public String toString(){
        String res = new String();
        System.out.println("Outputting the values inserted in the List:");
        for(Complex i:cList){
           res = res + i.getReal()+(i.getImg()>=0?'+':'-')+(i.getImg()<0?i.getImg()*-1:i.getImg())+'i'+'\n';
        }
        return res;
    }
}

public class Test_Q1 {

    public static void main(String[] args) {
        ComplexList list = new ComplexList();
        while (true) {
            System.out.println("choice 1: to add 2: to exit :");
            Scanner c = new Scanner(System.in);
            int choice_val = c.nextInt();
            if (choice_val == 1) {
                list.add(new Complex().setComplex());
            } else if (choice_val == 2) {
                break;
            } else {
                System.out.println("Wrong input. Type again");
            }
        }
        System.out.println(list);
    }
}
