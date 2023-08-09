/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shop_item;

/**
 *
 * @author Briana
 */
public class CountedItem extends PurchaseItem {
    private int quantity;
    
    public CountedItem(String na, Double price, int qnt){
        super(na, price);
        
        quantity = qnt;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    @Override
    public double getPrice(){
        return unitPrice * quantity;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\t" + quantity + " units" + "\t\tTotal= " + String.format("%.2f", getPrice()) + "\tCountedItem";
    }
}
    

