/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstarction__prac;

/**
 *
 * @author Briana
 */
public class BasePlusCommissioned extends Commissioned{
    private double salary;
    
    public BasePlusCommissioned(String eName, String eNumber, Double totalSales, Double rate, Double salary) {
        super(eName, eNumber, totalSales, rate);
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
        return salary + super.getIncome();
    }
    
    @Override
    public String toString() {
        return "Base Plus Commissioned Employee: " + super.toString() + ", Sales: " + totalSales + ", Commission Rate: " + rate + ", Base Salary: " + salary;
    }
}
