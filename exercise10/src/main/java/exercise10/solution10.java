/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tyler Mozo
 */

/*
PSEUDO
get price and quantity from user of item 1
get price and quantity from user of item 2
get price and quantity from user of item 3
sum all of the prices together to get the subtotal
find 5.5 or .055*subtotal to get the tax
apply the tax of 5.5% or 1.055*subtotal to get the total
printf ot total

 */


package exercise10;
import java.util.Scanner;

public class solution10 {
    public static Scanner input = new Scanner(System.in);

    public static double getItem1Price(){
        System.out.print("What is the price of item 1: ");
        double item1Price = input.nextDouble();
        return item1Price;
    }

    public static double getItem1quant() {
        System.out.print("What is the quantity of item 1: ");
        double item1quant = input.nextDouble();
        return item1quant;
    }

    public static double getItem2Price(){
        System.out.print("What is the price of item 2: ");
        double item2Price = input.nextDouble();
        return item2Price;
    }

    public static double getItem2quant(){
        System.out.print("What is the quant of item 2: ");
        double item2quant = input.nextDouble();
        return item2quant;
    }

    public static double getItem3Price(){
        System.out.print("What is the price of item 3: ");
        double item3Price = input.nextDouble();
        return item3Price;
    }

    public static double getItem3quant(){
        System.out.print("What is the quant of item 3: ");
        double item3quant = input.nextDouble();
        return item3quant;
    }

    public static double totalItem1(double item1Price, double item1quant){
        double item1total = item1Price * item1quant;
        return item1total;
    }

    public static double totalItem2(double item2Price, double item2quant){
        double item2total = item2Price * item2quant;
        return item2total;
    }

    public static double totalItem3(double item3Price, double item3quant){
        double item3total = item3Price * item3quant;
        return item3total;
    }

    public static double subtotal(double item1total, double item2total, double item3total){
        double subtotal = (item1total+item2total+item3total);
        System.out.printf("Subtotal: $%d",subtotal);
        return subtotal;
    }

    public static double tax(double subtotal, double tax){
        double taxAmount = subtotal*tax;
        System.out.printf("Tax: $%d", tax);
        return taxAmount;
    }

    public static double Total(double taxAmount,double subtotal){
        double total = taxAmount + subtotal;
        System.out.printf("Total: $%d", total);
        return total;
    }

    public static void main(String[] args) {

        double tax = .055;
        double item1Price = getItem1Price();
        double item1quant = getItem1quant();

        double item2Price = getItem2Price();
        double item2quant = getItem2quant();

        double item3Price = getItem3Price();
        double item3quant = getItem3quant();

        double item1total = totalItem1(item1Price, item1quant);
        double item2total = totalItem2(item2Price, item2quant);
        double item3total = totalItem3(item3Price, item3quant);

        double subtotal = subtotal( item1total, item2total, item3total);
        double taxAmount = tax(subtotal, tax);
        double total = Total( taxAmount, subtotal );
        
    }
}
