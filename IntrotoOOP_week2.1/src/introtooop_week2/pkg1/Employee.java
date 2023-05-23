package introtooop_week2.pkg1;


import java.util.Scanner;

/**
 *
 * @author bnzivu
 */

public class Employee {
    private int eNumber;
    private String eName;
    private int eSalary;
    private int payrise;
    private int x;
    Scanner s = new Scanner(System.in);
    
    Employee (){
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
    
    public void getData(Employee X){
       X.display();
    }
}
