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
public class A7Q9 {

    /**
     * @param args the command line arguments
     */
    public static boolean allOddDigits(int number) {
        boolean oddNumber = true;

        if (String.valueOf(number).contains("1")) {
            oddNumber = true;
        }
        if (String.valueOf(number).contains("3")) {
            oddNumber = true;
        }
        if (String.valueOf(number).contains("5")) {
            oddNumber = true;
        }
        if (String.valueOf(number).contains("7")) {
            oddNumber = true;
        }
        if (String.valueOf(number).contains("9")) {
            oddNumber = true;
        }
        if (String.valueOf(number).contains("2")) {
            oddNumber = false;
        }
        if (String.valueOf(number).contains("4")) {
            oddNumber = false;
        }
        if (String.valueOf(number).contains("6")) {
            oddNumber = false;
        }
        if (String.valueOf(number).contains("8")) {
            oddNumber = false;
        }
        if (String.valueOf(number).contains("0")) {
            oddNumber = false;
        }
        return oddNumber;
    }

    public static void main(String[] args) {
        // scanner input to get user input
        Scanner input = new Scanner(System.in);
        //ask user to input a number to find if all the digits are odd
        System.out.println("Please enter a number below: ");
        int number = input.nextInt();

        //output true or false whether all the digits are odd
        System.out.println("True or false: Are all the numbers odd?");
        System.out.println(allOddDigits(number));
    }
}
