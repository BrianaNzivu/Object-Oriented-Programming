/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance;

/**
 *
 * @author Briana
 */
public class Employee extends Person {
    private double salary;
    private int hours;
    private static final double RATE_PER_HOUR = 1000;

    public Employee(String na, String no, Double sa, int hrs) {
        super(na, no);
        sa = salary;
        hrs = hours;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
    
    public double calcPay(){
        salary = hours * RATE_PER_HOUR;
        return salary;
    }
    
    
}
