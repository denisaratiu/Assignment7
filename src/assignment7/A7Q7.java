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
    public static void firstDigit(double[] number) {
        //find the first digit in the number
        double first = number[0];
        System.out.println(first);
        }

    public static void main(String[] args) {
        // scanner input to get user input
        Scanner input = new Scanner(System.in);
        //ask user to input a number to find the first digit
        System.out.println("Please enter a number below: ");
        double[] number = input.nextDouble();

        //output the first digit
        System.out.println("The first digit in that number is: ");
        firstDigit(number);
    }
}
