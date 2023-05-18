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
    private int x;
    Scanner s = new Scanner(System.in);
    
    IntrotoOOP_week21 (){
        System.out.println("Enter name: ");
        eName = s.next();
     
        check();
        
        System.out.println("Enter Salary: ");
        eSalary = s.nextInt();
    }
    public void check(){
        System.out.println("Enter number: ");
        x = s.nextInt();
        
        while (x>999){
             System.out.println("ERROR:NUMBER SHOULD BE LESS THAN 1000");
             check();
        }
        eNumber = x;
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
