/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication151;
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class JavaApplication151 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
        Scanner t= new Scanner(System.in);
      char ch=t.next().charAt(0);
      
         System.out.println("enter the character:" );
         ch=t.next().charAt(0);
         if(ch>='0'&&ch<='9')
             System.out.println("Digit");
         else if(ch>='a'&&ch<='z')
            System.out.println("letter");
         else
             System.out.println("other");
        
        
        
        
        
    }
    
}
