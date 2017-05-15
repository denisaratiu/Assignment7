/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;

import java.util.Scanner;

/**
 *
 * @author ratid6445
 */
public class A7Q2 {

    /**
     * @param args the command line arguments
     */
    public static String examGrade(double examPercentage) {

        String letterGrade = "";
        if (examPercentage >= 80) {
            letterGrade = ("A");
        } else if (examPercentage <= 79 && examPercentage >= 70) {
            letterGrade = ("B");
        } else if (examPercentage <= 69 && examPercentage >= 60) {
            letterGrade = ("C");
        } else if (examPercentage <= 59 && examPercentage >= 50) {
            letterGrade = ("D");
        } else if (examPercentage <= 50) {
            letterGrade = ("F");
        }
        return letterGrade;
    }

    public static void main(String[] args) {
        // scanner input to get user input
        Scanner input = new Scanner(System.in);
        // ask user to input the mark of the exam in percentage form
        System.out.println("Please enter the exam mark as a percent below: ");
        int examPercentage = input.nextInt();

        //output the answer
        String ans = examGrade(examPercentage);
        System.out.println("Exam mark as a grade: " + ans);
    }
}
