/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tyler Mozo
 */

/*
PSEUDO
ask user for length of room and assign to length variable
ask user for width of room and assign to width variable
use these values to calculate square footage (L * W)
calculate how many gallons are need for the square footage (totalSF/sfPerGallon)
use math.ciel() function to round to the next nearest number
 */

package exercise09;
import java.util.Scanner;

public class solution09 {
    public static Scanner input = new Scanner(System.in);

    public static double getLength(){
        System.out.print("What is the length of the room? ");
        double length = input.nextDouble();
        return length;
    }

    public static double getWidth(){
        System.out.print("What is the width of the room? ");
        double width = input.nextDouble();
        return width;
    }

    public static double calcSF(double length, double width){
        double totalSF = length * width;
        return totalSF;
    }

    public static void main(String[] args) {
       double sfPerGallon = 350;
       double length = getLength();
       double width = getWidth();
       double totalSF = calcSF(length, width);

       double gallon = (totalSF/sfPerGallon);


       System.out.println("You will need to purchase "+ Math.ceil(gallon) +" gallons of paint to cover "+totalSF+" square feet.");
    }
}
