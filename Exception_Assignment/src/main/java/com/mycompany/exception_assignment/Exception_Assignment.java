/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exception_assignment;

import java.util.Scanner;

/**
 *
 * @author Briana
 */
public class Exception_Assignment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee emp1 = new Employee();
        
        try{
            while (true){
                System.out.println("Enter job grade: ");
                String grade = scanner.next();
                
                System.out.println("Enter hourly salary in (ksh): ");
                double salary = scanner.nextInt();
                
                emp1.addJobGradeAndSalary(grade, salary);
                
                System.out.println("Do you wish to enter another? (y/n): ");
                if(!scanner.next().equalsIgnoreCase("y")){
                    break;
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }          
    }
}


