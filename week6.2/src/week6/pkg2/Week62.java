/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6.pkg2;

/**
 *
 * @author bnzivu
 */
public class Week62 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee e1 = new Employee("Mary", "100", 2000.00, 0.06);
        System.out.println(e1.geteName() + " " + e1.geteNumber() + " " + e1.income());
        
        SaleEmployee e2 = new SaleEmployee("Tom", "200", 20000.00, 0.06, 10000.00);
        System.out.println(e2.geteName() + " " + e2.geteNumber() + " " + e2.income());
    }
    
}
