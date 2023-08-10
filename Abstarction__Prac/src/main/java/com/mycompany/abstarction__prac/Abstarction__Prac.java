/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.abstarction__prac;

/**
 *
 * @author Briana
 */
public class Abstarction__Prac {

    public static void main(String[] args) {
        Salaried s1 = new Salaried("John Smith", "111-11-1111", 800.00);
        Hourly h1 = new Hourly("Karen Price", "222-22-222", 40, 50.00);
        Commissioned c1 = new Commissioned("Sue Jnes", "333-33-333", 100000.00, 0.04);
        BasePlusCommissioned b1 = new BasePlusCommissioned("Bob Lewis", "444-44-444", 10000.00, 0.04, 40000.00);
        
        System.out.println(s1.getIncome());
        System.out.println(h1.getIncome());
        System.out.println(c1.getIncome());
        System.out.println(b1.getIncome());
    }
}
