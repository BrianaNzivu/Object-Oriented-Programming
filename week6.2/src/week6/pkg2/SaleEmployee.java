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
public class SaleEmployee extends Employee{
    private double eSalary;
    
    SaleEmployee(String na, String no, double sa, double ra, double sal){
        super(na,no,sa,ra);
        eSalary = sal;
}
    
    public double geteSalary(){
        return eSalary;
    }
    
    public double income(){
        return (getRate() * getSales()) + eSalary;
    
    
    }
}
