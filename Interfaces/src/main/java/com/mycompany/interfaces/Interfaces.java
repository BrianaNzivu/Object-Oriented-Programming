/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interfaces;

/**
 *
 * @author Briana
 */
public class Interfaces {

    public static void main(String[] args) {
        Payable p1 = new Invoice("Pens", 2, 3.75);
        Payable p2 = new Employee("Leonard", "100", 80000);
        
        System.out.println(p1.getPaymentAmount());
        System.out.println(p2.getPaymentAmount());
    }
}
