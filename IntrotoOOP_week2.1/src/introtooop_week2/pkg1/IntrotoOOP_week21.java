package introtooop_week2.pkg1;

/**
 *
 * @author bnzivu
 */

import java.util.Scanner;

public class IntrotoOOP_week21 {
    
    private int eNumber;
    private String eName;
    private int eSalary;
    private int payrise;
    
    IntrotoOOP_week21 (){
     Scanner s = new Scanner(System.in);
        
        System.out.println("Enter name: ");
        eName = s.next();
        
        System.out.println("Enter number: ");
        int x = s.nextInt();
        if (x>999){
             System.out.println("ERROR:NUMBER SHOULD BE LESS THAN 1000");
        }
        else{
        eNumber = x;}
        
        System.out.println("Enter Salary: ");
        eSalary = s.nextInt();
    }

    public void display(){
        System.out.println("Name is: "+ eName + " Number is: " + eNumber);
    }
    
    public void payRise(){
        payrise = ((110 * eSalary)/100);
        System.out.println("Salary after payrise is: "+ payrise);
    }
    
    public static void main(String[] args) {
        IntrotoOOP_week21  empOne = new IntrotoOOP_week21();
        IntrotoOOP_week21 empTwo = new IntrotoOOP_week21();
        IntrotoOOP_week21 empThree = new IntrotoOOP_week21();
        
        empOne.display();
        empOne.payRise();
        
        empTwo.display();
        empTwo.payRise();
        
        empThree.display();
    }
    
}
