/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1.pkg1;

/**
 *
 * @author bnzivu
 * 
 */

import java.util.Scanner;
        
public class Week1_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter a number");
        int n1 = s.nextInt();
        
        System.out.println("Enter a number");
        int n2 = s.nextInt();
        
        int c = n1 + n2;
        System.out.println(c);
    }
    
}
