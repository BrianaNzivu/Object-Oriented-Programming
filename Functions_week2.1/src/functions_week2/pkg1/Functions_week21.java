/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functions_week2.pkg1;

/**
 *
 * @author bnzivu
 */
public class Functions_week21 {

    public static int myAddition (int a, int b){
        int c = a + b;
        return c;
    }
    
    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        int c = myAddition(a,b);
        System.out.println(c);
    }
    
}
