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
public class Employee {
    private String eName;
    private String eNumber;
    private Double sales;
    private Double rate;
    
    Employee(String na, String no, Double sa, Double ra){
       eName = na;
       eNumber = no;
       sales = sa;
       rate = ra;
    }

    public String geteName() {
        return eName;
    }

    public String geteNumber() {
        return eNumber;
    }

    public Double getSales() {
        return sales;
    }

    public Double getRate() {
        return rate;
    }
    
    public double income (){
       return sales * rate; 
    }
}
