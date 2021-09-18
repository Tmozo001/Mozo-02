/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tyler Mozo
 */
/*
PSEUDO
ask user for amount of people and assign to people variable
ask user for amount of pizza and assign to pizza variable
ask user for amount of slices per pizza and assign to slices
calculate the total amount of pizza slices total = (pizza * slices)
using these variables determine amount of slices per person int (total/person)
find the remainder with slices leftover = total%people

convert square foot to meters squared
print all desired output
 */

package exercise08;
import java.util.Scanner;

public class solution08 {
    public static Scanner input = new Scanner(System.in);

    public static int peopleCount(){
        System.out.print("How many people are going to grub? ");
        int people = input.nextInt();
        return people;
    }
    public static int pizzaCount(){
        System.out.print("How many pizzas are we buying? ");
        int pizza = input.nextInt();
        return pizza;
    }
    public static int sliceCount(){
        System.out.print("How many slices for pizza? ");
        int slices = input.nextInt();
        return slices;
    }

    public static int total(int pizza, int slices){
        int total = pizza * slices;
        return total;
    }

    public static int division(int total, int people){
        int quotient = (total/people);
        System.out.printf("Each person gets %d slices of pizza\n", quotient);
        return quotient;
    }

    public static int leftovers(int total, int people){
        int leftovers = (total%people);
        System.out.printf("There are %d leftover slices\n", leftovers);
        return leftovers;
    }

    public static void main(String[] args) {
       int people = peopleCount();
       int pizza = pizzaCount();
       int slices = sliceCount();

       int total = total(pizza, slices);

       System.out.printf("%d people with %d pizzas (%d slices)\n",people, pizza, total);

       int quotient = division(total, people);

       int leftovers = leftovers(total, people);

    }
}
