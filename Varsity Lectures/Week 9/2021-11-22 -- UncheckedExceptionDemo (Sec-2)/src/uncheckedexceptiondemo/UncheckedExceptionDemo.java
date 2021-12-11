package uncheckedexceptiondemo;
public class UncheckedExceptionDemo {
    public static void main(String[] args) {
        int[] arr={11,22,33,44,55};
        System.out.println("Welcome");
        System.out.println(arr[2]);
        //System.out.println(arr[5]);
        Student[] studArr = new Student[10];
        int i;
        for(i=0;i<studArr.length;i++){
            studArr[i] = new Student();
            studArr[i].setStudInfo();
        }
        
        System.out.println("Good by....");
    }   
}
