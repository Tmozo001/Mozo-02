/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tyler Mozo
 */

/*
PSEUDO
ask the user for the principal amount and store in variable principal
ask the user for the interest rate and store it in variable rate
ask the user how many years and assign to variable years
convert percentage to decimal in a function interest = (rate)/100
calculate total after interest with principal(1+interest(years))

 */

package exercise12;
import java.util.Scanner;

public class solution12 {
    public static Scanner input = new Scanner(System.in);

    public static double getPrincipal(){
        System.out.print("Enter the principal: ");
        double principal = input.nextDouble();
        return principal;
    }
    public static double getRate(){
        System.out.print("Enter the rate of interest: ");
        double rate = input.nextDouble();
        return rate;
    }
    public static int getYears(){
        System.out.print("Enter the number of years: ");
        int years = input.nextInt();
        return years;
    }
    public static double rateConversion(double rate){
        double interest = rate/100;
        return interest;
    }
    public static double Final(double principal, double interest, int years, double rate){
        double finalPrice = principal*(1+interest*(years));
        System.out.printf("After %d years at %.2f%%, the investment will be worth $%.2f.",years,rate, finalPrice);
        return finalPrice;
    }

    public static void main(String[] args) {
        double principal = getPrincipal();
        double rate = getRate();
        int years = getYears();

        double interest = rateConversion(rate);

        double finalPrice = Final(principal, interest, years, rate);
    }
}
