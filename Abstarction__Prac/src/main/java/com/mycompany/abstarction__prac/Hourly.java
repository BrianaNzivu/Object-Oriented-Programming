/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstarction__prac;

/**
 *
 * @author Briana
 */
public class Hourly extends Employee {
    
    private int hours;
    private double rate;
    
    public Hourly(String eName, String eNumber, int hrs, Double rate) {
        super(eName, eNumber);
        this.hours = hrs;
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
    
    @Override
    public double getIncome(){
        return hours * rate;
    }
    
    @Override
    public String toString() {
        return "Hourly Employee: " + super.toString() + ", Hours Worked: " + hours + ", Hourly Rate: " + rate;
}
    
}
