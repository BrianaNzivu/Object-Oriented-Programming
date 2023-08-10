/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaces_assignment;

/**
 *
 * @author Briana
 */
public class Bicycle implements CarbonCalc{
    private double eOthers;

    public Bicycle() {
    }

    public Bicycle(double eOthers) {
        this.eOthers = eOthers;
    }

    @Override
    public double getCarbonFootprint() {
        return eOthers;
    }
    
}
