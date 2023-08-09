/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week4_1;

/**
 *
 * @author Briana
 */
public class Employee {
    private String eName;
    private int eNumber;
    private int eAge;
    
    public int getEnumber(){
        return eNumber;
    }
    
    public void seteNumber(int eNumber) {
    this.eNumber = eNumber;
    }
    
    public String getName(){
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public int geteAge() {
        return eAge;
    }

    public void seteAge(int eAge) {
        eAge = checkAge(newage);
    }
    
    public int checkAge(int newage) throws Exception{
        if(newage>18 && newage<= 60){
            return newage;
        }
        else{
            throw new Exception("Illegal age");
        }
    }
    
 }
    
