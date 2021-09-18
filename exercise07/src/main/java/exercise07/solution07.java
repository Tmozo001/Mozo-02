/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tyler Mozo
 */
/*
PSEUDO
ask user for length and assign to length variable
ask user for width and assign to width variable
using these variables determine area in square foot
convert square foot to meters squared
print all desired output
 */

package exercise07;

import java.util.Scanner;

public class solution07 {
    public static Scanner input = new Scanner(System.in);

    static int getLength(){
        System.out.print("What is the length of the room in feet? ");
        int length = input.nextInt();
        return length;
    }

    static int getWidth(){
        System.out.print("What is the width of the room in feet? ");
        int width = input.nextInt();
        return width;
    }

    static double conversion(int area, double c){
        double m2 = area * .09290304;
        return m2;
    }


    public static void main(String[] args) {
        int length = getLength();
        int width = getWidth();

        int area = length * width;

        double c = .09290304;
        double m2 = conversion(area,c);

        System.out.printf("You entered dimensions of %d feet by %d feet.",length, width);
        System.out.printf("The area is\n%d square feet\n%.3f", area, m2) ;

    }
}
