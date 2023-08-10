/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstarction__prac;

/**
 *
 * @author Briana
 */
public class Commissioned extends Employee{
    double totalSales;
    double rate;

    public Commissioned(String eName, String eNumber, Double totalSales, Double rate) {
        super(eName, eNumber);
        this.totalSales = totalSales;
        this.rate = rate;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public double getIncome() {
        return totalSales * rate;
    }
    
    @Override
    public String toString() {
        return "Commissioned Employee: " + super.toString() + ", Sales: " + totalSales + ", Commission Rate: " + rate;
    }
    
}
