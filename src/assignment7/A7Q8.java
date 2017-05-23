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
public class A7Q8 {

    /**
     * @param args the command line arguments
     */
    public static void season(int month, int day) {
        // Fall - start at September 16 and go until December 15
        if((month == 9 && day >= 16)|| month == 10 || month == 11 
                || (month == 12 && day <=15)) {
            String realSeason = "Fall";
            System.out.println(realSeason);
            
            // Spring
        } else if ((month == 3 && day >= 16) || month == 4 || month == 5
                || (month == 6 && day <= 15)) {
            String realSeason = "Spring";
            System.out.println(realSeason);

            // Winter
        } else if ((month == 12 && day >= 16) || month == 1 || month == 2
                || (month == 3 && day <= 15)) {
            String realSeason = "Winter";
            System.out.println(realSeason);

            // Summer
        } else {
            String realSeason = "Summer";
            System.out.println(realSeason);
        }
    }

    public static void main(String[] args) {
        // scanner input to get user input
        Scanner input = new Scanner(System.in);
        //ask user to input a the month and date
        System.out.println("Please enter the month, as an integer, below: ");
        int month = input.nextInt();
        System.out.println("Please enter the day, as an integer, below: ");
        int day = input.nextInt();

        //output the season
        System.out.println("The season for that date is: ");
        season(month,day);
       
    }
}