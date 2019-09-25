package com.company;

import java.util.Scanner;


/*
Arianna Richardson
September 24, 2019
This program takes the whole number amount of cents inputted,
and distributes them in the corresponding coin amounts.
 */
public class CorrectChange
{
    //Start of code
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.print("Please enter a whole number amount of cents: ");
                int input = value.nextInt(); //input specified amount here:

              // Code to get dollars(DOLLARS):
                int dollars = input / 100;
                System.out.print(dollars+ " dollar(s), ");
                int remainder = input % 100;
                /* (used remainder operands from dollars
                 to get initial amount to find out quarter amount)
                 -Used to get rest of amounts later on-
              */
               //QUARTERS
                int quarter = remainder/25;
                System.out.print(quarter+" quarters(s), ");
                     //DIMES
                int rem2 = remainder % 25;
                int dime = rem2 /10;
                System.out.print(dime+" dimes(s), ");

                //NICKELS
                int rem3 = remainder % 10;
                int nickel = rem3 / 5;
                System.out.print(nickel+" nickel(s), and ");
               // PENNIES - did not need to use remainder formula here-
                int penny = rem3 % 5;
                 System.out.print(penny+" penny(ies).");
                 //End of code






    }
}
