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
public class A7Q7 {

    /**
     * @param args the command line arguments
     */
    public static int firstDigit(int number) {
        //negative number turn to positive
        if (number < 0) {
            number = number * -1;
        }

        //find the first digit in the number
        while (number >= 10) {
            number = number / 10;
        }
        return number;
    }

    public static void main(String[] args) {
        // scanner input to get user input
        Scanner input = new Scanner(System.in);
        //ask user to input a number to find the first digit
        System.out.println("Please enter a number below: ");
        int number = input.nextInt();

        //output the first digit
        System.out.println("The first digit in that number is: ");
        int answer = firstDigit(number);

        System.out.println(answer);
    }
}
