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
public class A7Q6 {

    /**
     * @param args the command line arguments
     */
    public static void lastDigit(int number) {
        //find the last digit in the 
        int last= number%10;
        if(last<0){
            last = last * -1;
        }
        System.out.println(last);
        }

    public static void main(String[] args) {
        // scanner input to get user input
        Scanner input = new Scanner(System.in);
        //ask user to input a number to find the last digit
        System.out.println("Please enter a number below: ");
        int number = input.nextInt();

        //output the answer 
        System.out.println("The last digit in that number is: ");
        lastDigit(number);
    }
}
