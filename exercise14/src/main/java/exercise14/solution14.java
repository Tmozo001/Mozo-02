/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tyler Mozo
 */

/*
PSEUDO
ask user what the order amount is and assign it to variable amount
ask the user what state they are in
make a function to add .055 of amount to amount giving us the total price.
make an if statement that if the state is == WI than we add tax, else no tax
 */

package exercise14;
import java.util.Scanner;

public class solution14 {
    public static Scanner input = new Scanner(System.in);

    public static double getAmount(){
        System.out.print("What is the order amount? ");
        double amount = input.nextDouble();
        return amount;
    }

    public static String getState(){
        System.out.print("What is the state? ");
        String state = input.next();
        return state;
    }
    public static double getTax(double amount, double tax){
        double taxAmount = amount * tax;
        return taxAmount;
    }

    public static double addTax(double amount, double taxAmount){
        double total = amount + taxAmount;
        return total;
    }

    public static void main(String[] args) {
        double tax = .055;
        double amount = getAmount();
        String state = getState();

        System.out.printf("The subtotal is $%.2f", amount);

        if((String) state == "WI") {
            double taxAmount = getTax(amount, tax);
            System.out.printf("The tax is $%.2f.", taxAmount);

            double total = addTax(amount, taxAmount);
            System.out.printf("The total is $%.2f", total);
        }

    }
}
