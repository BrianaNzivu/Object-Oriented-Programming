package week3.pkg1;

import java.util.Scanner;

/**
 *
 * @author bnzivu
 */
public class Faculty {
   private int score;
   
   public void display(){
       System.out.println("The score is " + score);
   }
   
   public void grade(Student X){
       Scanner s = new Scanner(System.in);
       System.out.println("Enter the student score");
       score = s.nextInt();
       X.display();
       
   }
}
