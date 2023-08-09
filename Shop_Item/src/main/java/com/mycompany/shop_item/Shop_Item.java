/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.shop_item;

/**
 *
 * @author Briana
 */
public class Shop_Item {

    public static void main(String[] args) {
        WeightedItem w1 = new WeightedItem("Banana", 3.00, 1.37);
        CountedItem c1 = new CountedItem("Pens", 4.5, 10);
        
        System.out.println(w1);
        System.out.println(c1);
    }
}
