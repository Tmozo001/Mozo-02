/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tyler Mozo
 */

/*
PSEUDO
ask for height
ask for weight
calculate BMI
use if statement to figure out what range the BMI is in.
else if the other ranges
 */

package exercise19;
import java.util.Scanner;


public class solution19 {
    public static Scanner input = new Scanner(System.in);

    public static float getHeight(){
        System.out.print("How tall are you in inches? ");
        float height = input.nextFloat();
        return height;
    }
    public static float getWeight(){
        System.out.print("How heavy are you in pounds? ");
        float weight = input.nextFloat();
        return weight;
    }
    public static float calcBMI(float weight, float height){
        float BMI = (weight/(height*height))*703;
        System.out.printf("Your BMI is %.2f\n",BMI);
        return BMI;
    }

    public static void main(String[] args) {
        float height = getHeight();
        float weight = getWeight();
        float BMI = calcBMI(weight, height);

        if(BMI>=18.5 && BMI<=25)
            System.out.print("You are within the ideal weight range. CONGRATS.");
        else if(BMI>25)
            System.out.print("You are overweight. Please see a doctor.");
        else
            System.out.print("You are underweight. Please see a doctor.");
    }
}
