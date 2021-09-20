/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tyler Mozo
 */

/*
PSEUDO
ask for the amount of the purchase
now ask for the state
if wisconsin is chosen, ask for a county
if either dunn or eau claire are chose add their 2nd tax onto first tax
if anything else just state tax

if illinois is chose add their tax

if any other state no tax is added total = amount
 */


package exercise20;
import java.util.Scanner;


public class solution20 {
    public static Scanner input = new Scanner(System.in);

    public static float getAmount() {
        System.out.print("What is the order amount? ");
        float amount = input.nextFloat();
        return amount;
    }

    public static String getState() {
        System.out.print("What state do you live in?");

        String state = input.next();
        return state;
    }

    public static String getCounty(){
        System.out.print("What county do you live in?");
        String county = input.next();
        return county;
    }

    public static double Wisconsin(float amount, String county) {


        if (county.equals("Dunn")) {
            double tax = amount * .054;
            //double secondTax = amount * .004;
            //tax = tax + secondTax;
            System.out.printf("The tax is $%.2f.\n", tax);
            return tax;
        } else if (county.equals("Eau Claire")) {
            double tax = amount * .055;
            //double secondTax = amount * .005;
            //tax = tax + secondTax;
            System.out.printf("The tax is $%.2f.\n", tax);
            return tax;
        } else {
            double tax = amount * .05;
            System.out.printf("The tax is $%.2f.\n", tax);
            return tax;
        }
    }




        public static double Illinois (float amount){
            double tax = amount * .08;
            System.out.printf("The tax is $%.2f.", tax);
            return tax;
        }

        public static void main (String[]args){
            float amount = getAmount();
            String state = getState();

            if (state.equals("Wisconsin")) {
                String county = getCounty();
                double tax = Wisconsin(amount, county);
                System.out.printf("The total is $%.2f.", amount + tax);
            } else if (state.equals("Illinois")) {
                double tax = Illinois(amount);
                System.out.printf("The total is $%.2f.", amount + tax);
            } else {
                System.out.printf("There is no state tax, the total is $%.2f.", amount);
            }
        }

}



