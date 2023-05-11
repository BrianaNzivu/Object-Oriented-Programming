/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1_1.pkg1;

/**
 *
 * @author bnzivu
 */

import java.util.Scanner;

public class Week1_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter a number");
        int n1 = s.nextInt();
        
        System.out.println("Enter a number");
        int n2 = s.nextInt();
        
        if(n1>n2)
            System.out.println(n1 + "is greater");
        else
            System.out.println(n2 + "is greater");
               
        
    }
    
}
