/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance;

/**
 *
 * @author Briana
 */
public class Student extends Person{
    private double[] scores;
    private char grade;
    
    public Student(String na, String no, double[] scores) {
        super(na, no);
        if (scores.length != 5) {
            System.out.println("Error: Expected 5 subject scores");
            return;
        }
        this.scores = scores;
        calculateGrade();
    }
    
    private void calculateGrade(){
        double sum = 0;
        for(double score : score){
            sum += score;
        }
        
        double average = sum / 5;
        
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
    
      }
    
    public char getGrade(){
        return grade;
    }
    
    public double calculateAverage() {
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        return sum / scores.length;
    }   
        

}
