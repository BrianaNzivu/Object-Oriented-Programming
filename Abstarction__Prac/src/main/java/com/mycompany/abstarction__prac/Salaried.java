/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstarction__prac;

/**
 *
 * @author Briana
 */
public class Salaried extends Employee {
    private double salary;

    public Salaried(String eName, String eNumber, Double salary) {
        super(eName, eNumber);
        this.salary = salary;          
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    @Override
    public double getIncome(){
        return salary;
    }
    
    @Override
    public String toString() {
    return "Salaried Employee: " + super.toString() + ", Salary: " + salary;
    }
}
