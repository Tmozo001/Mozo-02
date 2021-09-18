/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tyler Mozo
 */
/*
PSEUDO
ask user for current age and scan into variable age
ask user for desired retirement age and scan into variable retAge
figure out what year it is by using Calendar.getInstance().get(Calendar.YEAR)
assign this to variable year
do determine yearsUntil until retirement (retAge - age)
to determine how much time left, retYear (year + yearsUntil)
 */
package exercise06;

import java.util.Calendar;
import java.util.Scanner;

public class Solution06 {
    public static Scanner input = new Scanner(System.in);

    static int getAge(){
        System.out.print("What is your current age?");
        int age = input.nextInt();
        return age;
    }
    static int getRetAge(){
        System.out.print("At what age would you like to retire ?");
        int retAge = input.nextInt();
        return retAge;
    }

    public static void main(String[] args) {

        int age = getAge();
        int retAge = getRetAge();

        int year = Calendar.getInstance().get(Calendar.YEAR);



        int yearsUntil = retAge - age;
        System.out.println("You have "+ yearsUntil+ " years left until you can retire ");

        int retYear = year + yearsUntil;
        System.out.println("It's "+ year + ", so you can retire in " + retYear + ".");

    }
}
