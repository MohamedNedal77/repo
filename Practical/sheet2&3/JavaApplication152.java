/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication152;
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class JavaApplication152 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int rev=0;
       Scanner t= new Scanner(System.in);
       int num= t.nextInt();
       while(num>0)
       {
       rev=rev*10+num%10;
       num=num/10;
       
       }
       System.out.println(rev);
 
        
        
        
        
        
        
        
        
    }
    
}
