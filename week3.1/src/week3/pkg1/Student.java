package week3.pkg1;

import java.util.Scanner;

/**
 *
 * @author bnzivu
 */

public class Student {
    private int sNumber;
    private String sName;
    
    public void input(){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter Student Number: ");
        sNumber = s.nextInt();
        
        System.out.println("Enter Student Name: ");
        sName = s.next();   
    }
    
    public void display(){
        System.out.println("Student name: " + sName + "Student Number: " + sNumber);
        }
    
}
