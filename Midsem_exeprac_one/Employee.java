package Midsem_exeprac_one;

import java.util.Scanner;

public class Employee {
    private String eName;
    private String eNumber;
    private Double eSalary;
    private Double payRise;

    public void inputData (){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Employee name: ");
        eName = s.next();
        System.out.println("Enter Employee number: ");
        eNumber = s.next();
        System.out.println("Enter Employee Salary");
        eSalary = (double) s.nextInt();
    }

    public void payRise(){
        payRise = ((110 * eSalary)/100);
    }

    public void display (){
        System.out.println("Employee name: " + eName + "Ëmployee number: " + eNumber + "Salary: " + eSalary + "New Salary after PayRise: " + payRise);
    }
}

