/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exception_assignment;

/**
 *
 * @author Briana
 */

class InvalidExchangeRateException extends Exception{
    InvalidExchangeRateException(){
        super("Invalid exchange rate");
    }
}

class InvalidGradeException extends Exception{
    InvalidGradeException(String grade){
        super("Invalid grade: " + grade);
    }
}

public class Employee {
    private String[] jobGrades;
    private double[] hourlySalaries;
    private int gradeCount;
    
    public Employee(){
        jobGrades = new String[5];
        hourlySalaries = new double[5];
        gradeCount = 0;
    }
    
    public void addJobGradeAndSalary(String grade, double salary) {
        if (gradeCount >= 5) {
            throw new ArrayIndexOutOfBoundsException("You have reached the maximum number of job grades");
        }
        
        jobGrades[gradeCount] = grade;
        hourlySalaries[gradeCount] = salary;
        gradeCount ++;
        
    }
    
    
}
