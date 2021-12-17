/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;
import java.util.*;

/**
 *
 * @author thinker
 */
public class Admin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer>list = new ArrayList<Integer>();
        for(int i = 0;i<10;i++){
            list.add(i);
        }
        while(true){
            boolean notfound = true;
            for(int i = 0;i<list.size();i++){
                if(list.get(i)%2==0){
                    notfound = false;
                    list.remove(i);
                }
            }
            if(notfound==true){
                break;
            }
        }
        for(int i  = 0;i<list.size();i++){
            System.out.printf("Element "+i+" is = "+list.get(i)+'\n');
        }
    }
    
}
