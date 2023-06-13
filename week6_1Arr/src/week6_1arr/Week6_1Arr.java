/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6_1arr;

import java.util.Scanner;

/**
 *
 * @author bnzivu
 */
public class Week6_1Arr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String items [][] = new String [3][4];
        Scanner s = new Scanner(System.in);
        for (int r = 0; r<3; r++) {
            System.out.println("Enter name, Quantity cost: ");
            for(int c = 0; c<4; c++) {
                if(c == 3){
                   int cost = Integer.parseInt(items[r][1]) * Integer.parseInt(items[r][2]);
                   items [r][3] = String.valueOf(cost);
                }
                else{
                    items [r][c] = s.next();
                }
                     
            }
            
            for (int r2 = 0; r2<items.length; r2++) {
            System.out.println(items[r2][0] + "\t" + items[r][2] + "\t" + items[r][3]);
            }
        }
    }
    
}
