/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tyler Mozo
 */

/*
PSEUDO
 ask the user for their age and sotr into age variable
 compare their age to the legal driving age of 16 with a ternary operator
 legality = (age>=16) ? 1 : 0;
 if 1 print yes else print not old enough
 */


package exercise16;
import java.util.Scanner;

public class solution16 {
    public static Scanner input = new Scanner(System.in);

    public static int getAge(){
        System.out.print("What is your age? ");
        int age = input.nextInt();
        return age;
    }

    public static void main(String[] args) {
        int legal = 16;

        int age = getAge();

        int areYouLegal = (age > (legal - 1)) ? 1 : 0;

        if (areYouLegal == 1)
            System.out.print("You are old enough to legally drive.");
       else
            System.out.print("You are not old enough to legally drive.");
    }
}

