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
public class A7Q3 {

    /**
     * @param args the command line arguments
     */
    public static void factors(int number) {
        // create two integers
        int i = 1;
        int realNumber = number;
        //find factors of the number including one and itself
        while (i <= realNumber) {
            if (number % i == 0) {
                // print out the factors
                System.out.println(i);
            }
            i++;
        }
    }

    public static void main(String[] args) {
        // scanner input to get user input
        Scanner input = new Scanner(System.in);
        // ask user to input the mark of the exam in percentage form
        System.out.println("Please enter a number below: ");
        int number = input.nextInt();

        //output the answer
        System.out.println("The factors for the entered value are: ");
        factors(number);

    }
}
