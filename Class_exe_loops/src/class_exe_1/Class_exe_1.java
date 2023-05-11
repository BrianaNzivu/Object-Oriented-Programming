/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_exe_1;

/**
 *
 * @author bnzivu
 */
import java.util.Scanner;

public class Class_exe_1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean transaction = true;

        do {
            int n = 0;
            while(n<5){

                System.out.println("Enter a number");
                int scoreOne = s.nextInt();

                System.out.println("Enter a number");
                int scoreTwo = s.nextInt();

                int average = ((scoreOne + scoreTwo)/2);

                System.out.println(average);

                if(average>60)
                    System.out.println("Pass");
                else
                    System.out.println("Fail");

                n++;
            }

            System.out.print("Is there another transaction? (yes/no): ");
            String answer = s.next();

            transaction = answer.equalsIgnoreCase("yes");
        } while (transaction);

        s.close();
    }
}
