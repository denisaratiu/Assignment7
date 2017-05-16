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
public class A7Q4 {

    /**
     * @param args the command line arguments
     */
    public static double compoundInterest(double initialAmount, double interestRate, int years) {

        //calculate the final balance with the interest rate added 
        interestRate = 1 + interestRate;
        double exponent = Math.pow(interestRate, years);
        double balance = initialAmount * exponent;

        return balance;
    }

    public static void main(String[] args) {
        // scanner input to get user input
        Scanner input = new Scanner(System.in);
        // ask user to input all the information

        // user input initial amount
        System.out.println("Please enter the intial amount in the account below: ");
        double initialAmount = input.nextDouble();

        //user input interest rate
        System.out.println("Please enter the interest rate as a decimal number below: ");
        double interestRate = input.nextDouble();

        //user input years that will pass
        System.out.println("Please enter the number of years below: ");
        int years = input.nextInt();

        //output the final balane of the account
        double ans = compoundInterest(initialAmount, interestRate, years);
        ans = Math.round(ans * 100) / 100.0;
        System.out.println("The new balance of the account is $" + ans);
    }
}
