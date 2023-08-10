/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interfaces_assignment;

/**
 *
 * @author Briana
 */
public class Interfaces_Assignment {

    public static void main(String[] args) {
        CarbonCalc building = new Building(10000, 0.6, 1700);
        CarbonCalc car = new Car(1200, 30.0, 2.5);
        CarbonCalc bicycle = new Bicycle(30);
        
        System.out.println(building);
        System.out.println(car);
        System.out.println(bicycle);

    }
}
