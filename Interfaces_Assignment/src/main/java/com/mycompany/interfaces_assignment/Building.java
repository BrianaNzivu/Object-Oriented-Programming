/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaces_assignment;

/**
 *
 * @author Briana
 */
public class Building implements CarbonCalc{
    private double eConsump;
    private double eFactor;
    private double eOthers;

    public Building(double eConsump, double eFactor, double eOthers) {
        this.eConsump = eConsump;
        this.eFactor = eFactor;
        this.eOthers = eOthers;
    }

    public double geteConsump() {
        return eConsump;
    }

    public void seteConsump(double eConsump) {
        this.eConsump = eConsump;
    }

    public double getEfactor() {
        return eFactor;
    }

    public void setEfactor(double eFactor) {
        this.eFactor = eFactor;
    }

    public double geteOthers() {
        return eOthers;
    }

    public void seteOthers(double eOthers) {
        this.eOthers = eOthers;
    }
 
    @Override
    public double getCarbonFootprint() {
        return (eConsump * eFactor) + eOthers;
    }
    
}
