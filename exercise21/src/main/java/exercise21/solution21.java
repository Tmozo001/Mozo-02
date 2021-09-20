/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tyler Mozo
 */

/*
PSEUDO
ask the user for the number of the month
set up the switch case to assign the string the according monthname
print the crrect case
 */

package exercise21;
import java.util.Scanner;

public class solution21 {
    public static Scanner input = new Scanner(System.in);


    public static String switchMonth(int monthNum) {
        String monthName;

        switch (monthNum) {
            case 1:
                monthName = ("January");
                break;
            case 2:
                monthName = ("February");
                break;
            case 3:
                monthName = ("March");
                break;
            case 4:
                monthName = ("April");
                break;
            case 5:
                monthName = ("May");
                break;
            case 6:
                monthName = ("June");
                break;
            case 7:
                monthName = ("July");
                break;
            case 8:
                monthName = ("August");
                break;
            case 9:
                monthName = ("September");
                break;
            case 10:
                monthName = ("October");
                break;
            case 11:
                monthName = ("November");
                break;
            case 12:
                monthName = ("December");
                break;
            default:
                monthName = ("Not a month!");
                break;

        }
       return monthName;

    }

    public static void main(String[] args) {
        System.out.print("Please enter the number of the month: ");
        int monthNum = input.nextInt();

        String monthName = switchMonth(monthNum);
        System.out.printf("The name of the month is %s", monthName);
    }
}
