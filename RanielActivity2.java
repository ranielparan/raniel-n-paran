/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raniel.activity2;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class RanielActivity2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        do{
       
              num=num+1;
        
             if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
             
          } while (num<100);
    }
}    
    
    
    

