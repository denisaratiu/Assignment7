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
    public static int chaotic(int randNum) {
        // form the calculation to determine random pattern
        randNum = (int) (Math.random() * (5 - 1 + 1)) + 1;
        return randNum;
        
    }

    public static void main(String[] args) {
        //Scanner ipnut to get user input
        Scanner input = new Scanner(System.in); 
        // ask user to input a random number
        System.out.println("Please enter a random number below: ");
        int randNum = input.nextInt();
        
        //output answer
        double ans = chaotic(randNum);
        System.out.println("Random Pattern: " + ans);
    
    }
}
