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

    @Override
    public String toString() {
        String res = new String();
        return Integer.toString(this.real)+(this.img < 0 ? '-' : '+') + Integer.toString(this.img < 0 ? this.img * (-1) : this.img)+"i";
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

    public void augment(Complex[] CArr) {
        for (int i = 0; i < CArr.length; i++) {
            CArr[i] = new Complex().setComplex();
        }
        for (Complex i : CArr) {
            cList.add(i);
        }
    }

    public void display(int low, int high) {
        for (Complex i : cList) {
            if (i.getReal() <= low && i.getImg() >= high) {
                System.out.println(i);
            }
        }
    }

    @Override
    public String toString() {
        String res = new String();
        System.out.println("Outputting the values inserted in the List:");
        for (Complex i : cList) {
            res = res + i.getReal() + (i.getImg() >= 0 ? '+' : '-') + (i.getImg() < 0 ? i.getImg() * -1 : i.getImg()) + 'i' + '\n';
        }
        return res;
    }
}

public class Test_Q1 {

    public static void main(String[] args) {
        ComplexList list = new ComplexList();
        Scanner c = new Scanner(System.in);
        while (true) {
            System.out.println("choice 1: to add 2: to exit :");
            int choice_val = c.nextInt();
            if (choice_val == 1) {
                list.add(new Complex().setComplex());
            } else if (choice_val == 2) {
                break;
            } else {
                System.out.println("Wrong input. Type again");
            }
        }
        System.out.println("Ended");
        System.out.println("Enter Additional Inputs = ");
        int n = c.nextInt();
        Complex[] cArr = new Complex[n];
        list.augment(cArr);
        int lower, upper;
        System.out.println("Enter lower = ");
        lower = c.nextInt();
        System.out.println("Enter upper = ");
        upper = c.nextInt();
        list.display(lower, upper);
    }
}
