/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaces;

/**
 *
 * @author Briana
 */
public class Invoice implements Payable{
    private String iName;
    private int quantity;
    private double pricePerItem;

    public Invoice(String iName, int quantity, double pricePerItem) {
        this.iName = iName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    @Override
    public double getPaymentAmount() {
        return pricePerItem * quantity;
        
    }
  
}
