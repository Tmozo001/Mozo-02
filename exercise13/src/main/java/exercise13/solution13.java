/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tyler Mozo
 */

/*
PSEUDO
ask the user for the principal amount and store in variable principal
ask the user for the interest rate and store it in variable rate
ask the user how many years and assign to variable years
ask user for how many times a year it is compounded
convert percentage to decimal in a function interest = (rate)/100
calculate total after interest with principal(1+(interest/compound))^(years*compound)

 */

package exercise13;

import java.util.Scanner;

public class solution13 {
    public static Scanner input = new Scanner(System.in);

    public static double getPrincipal() {
        System.out.print("What is the principal amount? ");
        double principal = input.nextDouble();
        return principal;
    }

    public static double getRate() {
        System.out.print("what is the rate of interest? ");
        double rate = input.nextDouble();
        return rate;
    }

    public static int getYears() {
        System.out.print("What is the number of years? ");
        int years = input.nextInt();
        return years;
    }

    public static int getCompound() {
        System.out.print("What is the number of times the interest is compounded per year? ");
        int compound = input.nextInt();
        return compound;
    }

    public static double rateConversion(double rate) {
        double interest = rate / (double)100;
        return interest;
    }

    public static double finalValue(double principal, double interest, int compound, int years, double rate) {
        double finalPrice = principal *  Math.pow(1 + (interest / compound), (compound * (years)));
        System.out.printf("$%.2f invested at %.2f%% for %d years compounded %d times per year is %.2f.", principal, rate, years, compound, finalPrice);
        return finalPrice;
    }


    public static void main(String[] args) {
        double principal = getPrincipal();
        double rate = getRate();
        int years = getYears();
        int compound = getCompound();

        double interest = rateConversion(rate);

        double finalPrice = finalValue(principal, interest,compound, years, rate);
    }
}