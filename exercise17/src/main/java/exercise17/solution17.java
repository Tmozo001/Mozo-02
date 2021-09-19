/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tyler Mozo
 */

/*
PSEUDO
ask user for their sex
using an if statment determine if female or male
determine what ratio it becomes
find weight and assign to weight
find how many hours since last drink

determine BAC w3ith formula

use an if statment to see if BAC is in the legal limit
 */

package exercise17;
import java.util.Scanner;

public class solution17 {
    public static Scanner input = new Scanner(System.in);

    public static double getRatio(){
        System.out.print("Enter a 1 if you are a male or 2 if you are a female: ");
        int sex = input.nextInt();
        double ratio = 0;

        if(sex == 1 || sex == 2) {

            if (sex == 1)
                ratio = ratio + .73;
            else
                ratio = ratio + .66;
            return ratio;
        }
        else{
            System.out.print("Invalid input! \n");
            return getRatio();
        }

    }
    public static int getAlcOz(){
        System.out.print("How many ounces of alcohol did you have? ");
        int alcOz = input.nextInt();
        return alcOz;
    }
    public static int getWeight() {
        System.out.print("What is your weight, in pounds? ");
        int weight = input.nextInt();
        return weight;
    }

    public static int getHoursSince() {
        System.out.print("How many hours has it been since your last drink? ");
        int hoursSince = input.nextInt();
        return hoursSince;
    }

    public static double getBAC(double ratio, int alcOz, int weight, int hoursSince) {
        double BAC = (alcOz*(5.14/weight)*ratio)-.015*hoursSince;
        return BAC;

    }

    public static void getLegality(double BAC){
        if(BAC>=.08)
            System.out.print("It is not legal for you to drive.");
        else
            System.out.print("It is legal for you to drive.");
    }

    public static void main(String[] args) {
        double ratio = getRatio();
        int alcOz = getAlcOz();
        int weight = getWeight();
        int hoursSince = getHoursSince();

        double BAC = getBAC(ratio, alcOz, weight, hoursSince);

        System.out.printf("Your BAC is %.6f\n",BAC);
        getLegality(BAC);

    }

    }
