/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shop_item;

/**
 *
 * @author Briana
 */
public class PurchaseItem {
    private String itemName;
    double unitPrice;
    
    public PurchaseItem(String na, Double price){
        itemName = na;
        unitPrice = price;
    }
    
    public PurchaseItem(){
        this("no item", 0.0);
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    
    @Override
    public String toString(){
        return itemName + "@" + unitPrice;
    }
    
    public double getPrice(){
        return unitPrice;
    }
      
}
