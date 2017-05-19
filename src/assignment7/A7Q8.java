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
        // fall season
        if (month >= 9 && month <= 12 && day == 16 || day == 15) {
            String realSeason = "fall";
            System.out.println(realSeason);

            // Spring
        } else if (month >= 4 && month <= 6 && day == 16 || day == 15) {
            String realSeason = "Spring";
            System.out.println(realSeason);

            // Winter
        } else if (month >= 12 && month <= 3 && day == 16 || day == 15) {
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
        String answer = season(month && day);
        System.out.println(answer);
    }
}