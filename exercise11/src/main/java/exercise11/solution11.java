/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tyler Mozo
 */

/*
PSEUDO
ask the user for how many euros they're exchanging.
assgin the value to euroAmount
ask the user for the exchange rate
assign the value to exchangeRate
convert euros to dollars by (euroAmount * exchangeRate)
assign dollars to variable dollars
printf the results
 */

package exercise11;
import java.util.Scanner;

public class solution11 {
    public static Scanner input = new Scanner(System.in);

    public static double getEuros(){
        System.out.print("How many euros are you exchanging? ");
        double euroAmount = input.nextDouble();
        return euroAmount;
    }
    public static double getRate(){
        System.out.print("What is the exchange rate? ");
        double exchangeRate = input.nextDouble();
        return exchangeRate;
    }
    public static double Conversion(double euroAmount, double exchangeRate){
        double dollars = (euroAmount*exchangeRate);
        System.out.printf("%.2f euors at an exchange rate of %.4f is %.2f U.S. dollars.",euroAmount, exchangeRate,dollars);
        return dollars;
    }

    public static void main(String[] args) {
        double euroAmount = getEuros();
        double exchangeRate = getRate();

        double dollars = Conversion(euroAmount, exchangeRate);
    }
}
