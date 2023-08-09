/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inheritance;

import java.util.Scanner;

/**
 *
 * @author Briana
 */
public class Inheritance {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        System.out.println("Select an option:");
        System.out.println("1. Enter Student Details");
        System.out.println("2. Enter Employee Details");
        int choice = s.nextInt();
        s.nextLine(); 
        
        switch (choice) {
            case 1:
                System.out.println("\nEnter details for a student:");
                System.out.print("Name: ");
                String studentName = s.nextLine();
                System.out.print("Number: ");
                String studentNumber = s.nextLine();
                
                double[] studentScores = new double[5];
                System.out.println("Enter scores for 5 subjects:");
                for (int i = 0; i < 5; i++) {
                    System.out.print("Subject " + (i + 1) + ": ");
                    studentScores[i] = s.nextDouble();
                }   
                
                Student student = new Student(studentName, studentNumber, studentScores);
                System.out.println("\nStudent Details:");
                System.out.println(student);
                break;
                
            case 2:
                System.out.println("\nEnter details for an employee:");
                System.out.print("Name: ");
                String employeeName = s.nextLine();
                System.out.print("Phone Number: ");
                String employeePhoneNumber = s.nextLine();
                System.out.print("Hours Worked: ");
                int hoursWorked = s.nextInt();
                
                Employee employee = new Employee(na, employeePhoneNumber, hoursWorked);
                System.out.println("\nEmployee Details:");
                System.out.println(employee);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }

        scanner.close();
    }
}