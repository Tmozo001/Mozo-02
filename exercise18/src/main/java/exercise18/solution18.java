/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tyler Mozo
 */

/*
PSEUDO
ask user for unit
if upper or lower f & C continue
if C or c ask for Fahrenheit
convert to C
else
ask for C and convert to F

 */

package exercise18;
import java.util.Scanner;

public class solution18 {
    public static Scanner input = new Scanner(System.in);


    public static String getUnit(){
        String unit = input.nextLine();
        return unit;
    }

    public static double getF(){
        System.out.print("Please enter the temperature in Celsius:" );
        double F = input.nextDouble();
        return F;
    }
    public static double getC(){
        System.out.print("Please enter the temperature in Fahrenheit:" );
        double C = input.nextDouble();
        return C;
    }
    public static double FtoC(String unit,double F){
        double newTemp = (F-32)*(5/9);
        return newTemp;
    }

    public static double CtoF(String unit,double C){
        double newTemp = (C*(9/5)+32);
        return newTemp;
    }

    public static void main(String[] args) {
        System.out.print("Enter C to convert from Fahrenheit to Celsius\n");
        System.out.print("Enter F to convert from Celsius to Fahrenheit\n");
        double newTemp = 0;
        String unit = getUnit();

        if(unit.equals("C") || unit.equals("F") || unit.equals("c") ||unit.equals("f")){
            if(unit.equals("C") || unit.equals("c")) {
                System.out.print("Your Choice: C\n");
                double C = getC();
                newTemp = newTemp + FtoC(unit, C);
                System.out.printf("The temperature in Celsius is %f.", newTemp);
            }else {
                System.out.print("Your Choice: F\n");
                double F = getF();
                newTemp = newTemp + CtoF(unit, F);
                System.out.printf("The temperature in Fahrenheit is %f.", newTemp);
            }
        }
        else{
            System.out.print("Invalid input!\n");
            getUnit();
        }
    }
}
