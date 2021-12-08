package mainpkg;

import java.util.Random;
import java.util.Scanner;


public class MainClass {
    /*
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr1; //Recommended
        //int arr2[]; // Not recommended
        arr1 = new int[10];
        int i;
        for(i=0;i<arr1.length;i++){
            arr1[i] = r.nextInt(100);
        }
        //Student asif = new Student();
        String str = new String("Hello World");
        String str2 = "Welcome";
        
        System.out.println("str="+str);
        System.out.println("str2="+str2);
        System.out.print("arr1 array elements are: ");
        for(i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        
        int[] arr2 = {11,22,33,44,55};  
        System.out.println();
        System.out.print("arr2 array elements are: ");
        for(i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
    }
    */
    /*
    public static void main(String[] args) {
        float f = 3.5f;
        double d = 3.5;
        Scanner s = new Scanner(System.in);
        int n, i;
        System.out.print("How many students? ");
        n = s.nextInt();
        Student[] studArr = new Student[n];
        for(i=0;i<studArr.length;i++){
            studArr[i] = new Student();
            studArr[i].setStudInfo();
        }
        System.out.println("Student details are:");
        for(i=0;i<studArr.length;i++){
            studArr[i].showStudInfo();
        }
    }
    */
    /*
    public static void main(String[] args) {
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        int[][] twoDArr;
        int row, col, i,j;
        System.out.print("How many rows? ");
        row = s.nextInt();

        twoDArr = new int[row][];
        for(i=0;i<twoDArr.length;i++){
            System.out.print("How many columns for "+i+"-th row? ");
            col = s.nextInt();
            twoDArr[i] = new int[col];
            for(j=0;j<twoDArr[i].length ;j++)
                twoDArr[i][j] = r.nextInt(100);
        }
        
        System.out.println("twoDArr array elements are: ");
        for(i=0;i<twoDArr.length;i++){
            for(j=0;j<twoDArr[i].length ;j++){
                System.out.print(twoDArr[i][j]+" ");
            }
            System.out.println();
        }
    }
    */
    public static void main(String[] args) {
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        Student[][] twoDArr;
        int row, col, i,j;
        System.out.print("How many rows? ");
        row = s.nextInt();

        twoDArr = new Student[row][];
        for(i=0;i<twoDArr.length;i++){
            System.out.print("How many columns for "+i+"-th row? ");
            col = s.nextInt();
            twoDArr[i] = new Student[col];
            for(j=0;j<twoDArr[i].length ;j++){
                twoDArr[i][j] = new Student();
                twoDArr[i][j].setStudInfo();
            }
        }
        
        System.out.println("twoDArr array students are: ");
        for(i=0;i<twoDArr.length;i++){
            for(j=0;j<twoDArr[i].length ;j++){
                //System.out.print(twoDArr[i][j]+"       ");
                twoDArr[i][j].showStudInfo();
                System.out.print("     ");
            }
            System.out.println();
        }
    }
    
}

