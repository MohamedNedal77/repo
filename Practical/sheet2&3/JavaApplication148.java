/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication148;

import java.util.Scanner;
public class JavaApplication148 {
/**
 *
 * @author Student
 */public static void main(String[] arge){
 int num;
Scanner t= new Scanner(System.in);
System.out.print("enter number to check if divisible by 3 or 5 or both:");
num=t.nextInt();
if(num%3==0){
    System.out.print("divisible by 3");
}

if(num%5==0)
{
               System.out.print("divisible by 5");
}

else{
     System.out.print   ("divisible by 3 or 5 or both");
    
}
    
} 
}


