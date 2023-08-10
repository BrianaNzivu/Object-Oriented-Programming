/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaces;

/**
 *
 * @author Briana
 */
public class Employee implements Payable {
    private String eName;
    private String eNumber;
    private double salary;

    public Employee(String eName, String eNumber, double salary) {
        this.eName = eName;
        this.eNumber = eNumber;
        this.salary = salary;
    }

    
    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String geteNumber() {
        return eNumber;
    }

    public void seteNumber(String eNumber) {
        this.eNumber = eNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    

    @Override
    public double getPaymentAmount() {
        return salary;
    }
    
}
