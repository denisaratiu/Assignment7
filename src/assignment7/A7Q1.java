/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;

//import java.util.Scanner;
import java.util.Scanner;

/**
 *
 * @author ratid6445
 */
public class A7Q1 {

    /**
     * @param args the command line arguments
     */
    public static double circleArea(double radius) {
        // scanner input to get user input
        Scanner input = new Scanner(System.in);
        // ask user to input the radius of the circle
        System.out.println("Please enter the radius of the circle below: ");
        radius = input.nextInt();
        //find the area of the circle using the radius and formula A=πr2
        double areaCircle = Math.pow(radius, 2);
        areaCircle = Math.PI * areaCircle;
        return areaCircle;
    }

    //create a main class
    public static void main(String[] args) {
        //output the answer
        double ans = circleArea(5);
        System.out.println("The area of the circle is " + ans);
    }
}
