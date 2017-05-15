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
    public static String factors(int number) {
         
        for (int i = 0; i < number; i++) {
            if (number % i != 0){
               System.out.format(" %d  ", i);
            }
        }
        return number
    }
    public static void main(String[] args){
        // scanner input to get user input
        Scanner input = new Scanner(System.in);
        // ask user to input the mark of the exam in percentage form
        System.out.println("Please enter a number below: ");
        int number = input.nextInt();
        
        //output the answer
        double ans = factors(number);
        System.out.println("The factors for that number are: ");
    }
}
