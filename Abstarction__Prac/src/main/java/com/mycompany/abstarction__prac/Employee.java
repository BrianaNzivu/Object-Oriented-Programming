/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstarction__prac;

/**
 *
 * @author Briana
 */
public abstract class Employee {
    private String eName;
    private String eNumber;

    public Employee(String eName, String eNumber) {
        this.eName = eName;
        this.eNumber = eNumber;
            
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
    
    public abstract double getIncome();
    
 }
    
  
