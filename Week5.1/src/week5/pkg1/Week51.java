/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5.pkg1;

import java.util.Scanner;

/**
 *
 * @author bnzivu
 */
public class Week51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String name = s.next();
        System.out.println("Enter a Number: ");
        int number = s.nextInt();
        System.out.println("Enter a Salary: ");
        int salary = s.nextInt();
        
        Employee emp1 = new Employee("ICT");
        emp1.inputData(name, number, salary);     
        System.out.println(emp1.toString());
        emp1.displayData();
        
        Employee emp2 = new Employee("HR");
        System.out.println("Enter a name: ");
        name = s.next();
        System.out.println("Enter a Number: ");
        number = s.nextInt();
        System.out.println("Enter a Salary: ");
        salary = s.nextInt();
        
        emp2.inputData(name, number, salary);     
        System.out.println(emp2.toString());
        emp1.displayData();
                
    }
    
}
