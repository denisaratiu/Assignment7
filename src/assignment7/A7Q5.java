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
public class A7Q5 {

    /**
     * @param args the command line arguments
     */
    public static void chaotic(int numberLines) {
        // print out asterisks throughout the number of lines determined by user
        for (int i = 0; i < numberLines; i++) {
            //use the formula to find the pattern of asterisks at each line
            int numAsterisks = (int) (Math.random() * (5 - 1 + 1)) + 1;
            for (int j = 0; j < numAsterisks; j++) {
                System.out.print("*");
            }
            // print out the astericsks at seperate lines
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        //Scanner ipnut to get user input
        Scanner input = new Scanner(System.in);
        // ask user to input a random number to determine the amount of lines they want
        System.out.println("Please enter a random number below: ");
        int numberLines = input.nextInt();

        //output answer
        System.out.println("Random pattern: ");
        chaotic(numberLines);


    }
}
