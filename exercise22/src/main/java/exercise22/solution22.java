/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tyler Mozo
 */

/*
PSEUDO
ask the user for three numbers
compare the numbers and
print max after all the conmparisons
 */

package exercise22;
import java.util.Scanner;

public class solution22 {
    public static Scanner input = new Scanner(System.in);

    public static float getNum1(){
        System.out.print("Enter the first number: ");
        float num1 = input.nextFloat();
        return num1;
    }

    public static float getNum2(){
        System.out.print("Enter the second number: ");
        float num2 = input.nextFloat();
        return num2;
    }
    public static float getNum3(){
        System.out.print("Enter the third number: ");
        float num3 = input.nextFloat();
        return num3;
    }

    public static void comparisons(float num1, float num2,float num3){
        if( num1 >= num2 && num1 >= num3)
            System.out.printf("%f is the largest Number", num1);

        else if (num2 >= num1 && num2 >= num3)
            System.out.printf("%f is the largest Number", num2);

        else
            System.out.printf("%f is the largest Number", num3);
    }

    public static void main(String[] args) {
        float num1 = getNum1();
        float num2 = getNum2();
        float num3 = getNum3();

        comparisons(num1, num2, num3);
    }
}
