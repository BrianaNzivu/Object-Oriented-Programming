/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaces_assignment;

/**
 *
 * @author Briana
 */
public class Car implements CarbonCalc {
    private double distance;
    private double feulEff;
    private double eFactor;

    public Car(double distance, double feulEff, double eFactor) {
        this.distance = distance;
        this.feulEff = feulEff;
        this.eFactor = eFactor;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getFeulEff() {
        return feulEff;
    }

    public void setFeulEff(double feulEff) {
        this.feulEff = feulEff;
    }

    public double geteFactor() {
        return eFactor;
    }

    public void seteFactor(double eFactor) {
        this.eFactor = eFactor;
    }

    @Override
    public double getCarbonFootprint() {
        return (distance/feulEff) * eFactor;
    }    
}
