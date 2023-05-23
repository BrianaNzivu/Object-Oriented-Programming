package introtooop_week2.pkg1;

/**
 *
 * @author bnzivu
 */

import java.util.Scanner;

public class IntrotoOOP_week21 {
      
    public static void main(String[] args) {
        Employee  empOne = new Employee();
        Employee empTwo = new Employee();
        Employee empThree = new Employee();
        Employee empFour = new Employee();
        
        empOne.display();
        empOne.payRise();
        
        empTwo.display();
        empTwo.payRise();
        
        empThree.display();
        
        empFour.getData(empOne);
    }
    
}
