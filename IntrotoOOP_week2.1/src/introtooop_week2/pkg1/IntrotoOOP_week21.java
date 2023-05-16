package introtooop_week2.pkg1;

/**
 *
 * @author bnzivu
 */

import java.util.Scanner;

public class IntrotoOOP_week21 {
    
    private int eNumber;
    private String eName;

    public void inputData(){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter name: ");
        eName = s.next();
        
        System.out.println("Enter number: ");
        eNumber = s.nextInt();
    }
    
    public void display(){
        System.out.println("Name is: "+ eName + " Number is: " + eNumber);
    }
    
    public static void main(String[] args) {
        IntrotoOOP_week21  empOne = new IntrotoOOP_week21();
        IntrotoOOP_week21 empTwo = new IntrotoOOP_week21();
        
        empOne.inputData();
        empOne.display();
        
        empTwo.inputData();
        empTwo.display();
    }
    
}
