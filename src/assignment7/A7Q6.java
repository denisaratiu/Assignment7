/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;

/**
 *
 * @author ratid6445
 */
public class A7Q6 {

    /**
     * @param args the command line arguments
     */
    public static int lastDigit(double number) {
        //
        for (double i = 0; i > number; i++) {
            number[] = number[i];
        }
        return number;
    }

    public static void main(String[] args) {
        // scanner input to get user input
        Scanner input = new Scanner(System.in);
        //ask user to input a number to find the last digit
        System.out.println("Please enter a number below: ");
        int number = input.nextInt();

        //output the answer 
        double ans = lastDigit(number);
        System.out.println("The last digit in that number is: ");
    }
}
