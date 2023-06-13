/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6.pkg1;

import java.util.Scanner;

/**
 *
 * @author bnzivu
 */
public class Student {
    private int sNumber;
    private String sName;
    private enum test{
        quizOne(10), mid(20), quizTwo(10), fin(30), assignment(30);
        private final int maxScore;
        test(int sc) {
            this.maxScore = sc;
        }
    };
    
    test t;
    
    public void inputData() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Student name: ");
        sName = s.next();
        System.out.println("Enter Student number: ");
        sNumber = s.nextInt();
        int count = 1;
        for(test t: test.values()) {
          System.out.println(count + " " + t); 
          count ++;
        }
        System.out.println("Enter test (1-5): ");
        int exam = s.nextInt();
        switch(exam){
            case 1:
                t = test.quizOne;
                break;
            case 2:
                t = test.mid;
                break;
            case 3:
                t = test.quizTwo;
                break;
            case 4:
                t = test.fin;
                break;
            case 5:
                t = test.assignment;
                break;
        }
    }
    
    public void display() {
        System.out.println("Student Name: " + sName + "Student Number: " + sNumber + "Test: " + t + "Maximum Score: " + t.maxScore);
    }
    
}
