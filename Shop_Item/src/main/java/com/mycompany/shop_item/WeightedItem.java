/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shop_item;

/**
 *
 * @author Briana
 */
public class WeightedItem extends PurchaseItem {
    private double weight;
    
    public WeightedItem(String na, Double price, Double wght){
        super(na, price);
        
        weight = wght;       
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    @Override
    public double getPrice(){
        return unitPrice * weight;
    }
    
    @Override
    public String toString(){
    return super.toString() + "\t" + String.format("%.2fkg", weight) + "\t\tTotal = " + String.format("%.2f", getPrice()) + "\tWeightedItem";
    }
    
}
