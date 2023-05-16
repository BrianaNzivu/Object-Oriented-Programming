/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functions_classexe;

/**
 *
 * @author bnzivu
 */

import java.util.Scanner;

public class Functions_classexe {

      public static int myAddition (int a, int b){
        int c = a + b;
        return c;
    }
      
      public static int mySubtraction (int a, int b){
        int c = a - b;
        return c;
    }
    
      public static int myMultiplication (int a, int b){
        int c = a * b;
        return c;
    }
      
      public static int myDivide (int a, int b){
        int c = a / b;
        return c;
    }

      
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean transaction = true;
        
        do{
        
        System.out.println("Enter First number");
        int a = s.nextInt();

        System.out.println("Enter Second number");
        int b = s.nextInt();
        
        System.out.println("What function do you want to perform? (Addition, Subtraction, Multiplication and Division)");
        String function = s.next();
        
        if (function.equals("Addition"))
        {
            int c = myAddition(a,b);
            System.out.println(c);
        }
        
        if (function.equals("Subtraction"))
        {
            int c = mySubtraction(a,b);
            System.out.println(c);
        }
        
        if (function.equals("Multiplication"))
        {
            int c = myMultiplication(a,b);
            System.out.println(c);
        }
        
        if (function.equals("Division"))
        {
            int c = myDivide(a,b);
            System.out.println(c);
        }
        
        System.out.print("Is there another transaction? (yes/no): ");
            String answer = s.next();

            transaction = answer.equalsIgnoreCase("yes");
        } while (transaction);

        s.close();
    }
        
}
