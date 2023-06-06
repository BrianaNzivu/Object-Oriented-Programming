/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5.pkg1;

/**
 *
 * @author bnzivu
 */
public class Employee {
    private String eName;
    private int eNumber;
    private int eSalary;
    private final String department;
    
    Employee(String d){
        this.department = d;
    }
    
    public void inputData(String eName, int eNumber, int eSalary){
        this.eName = eName;
        this.eNumber = eNumber;
        this.eSalary = eSalary;
    }
    
    public String toString (){
        return eName + "\t\t" + eNumber + "\n";
    }
    
    public void displayData(){
        System.out.println("Salary: " + eSalary + "Department: " + department);
    }
    
    
}
