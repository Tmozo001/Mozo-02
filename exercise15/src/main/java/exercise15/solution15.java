/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tyler Mozo
 */

/*
PSEUDO
ask the user for their password
if this password matchs the key,
return welcome
else
deny and print i dont know you
 */

package exercise15;
import java.util.Scanner;

public class solution15 {
    public static Scanner input = new Scanner(System.in);

    public static String getPass(){

        System.out.print("What is the password? ");
        String pass = input.nextLine();
        return pass;
    }

    public static void main(String[] args) {
        String pass = getPass();
        String key = "abc$123";

        if(pass.equals(key))
            System.out.print("Welcome!");
        else
            System.out.print("I don't know you.");

    }
}
