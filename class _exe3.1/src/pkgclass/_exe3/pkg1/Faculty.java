/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgclass._exe3.pkg1;

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
   
   public void grade(Registrar X){
       Scanner s = new Scanner(System.in);
       System.out.println("Enter the student score");
       score = s.nextInt();
       X.display();
       
   }
}
