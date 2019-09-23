package com.company;

import java.util.Scanner;

public class CorrectChange {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("Please enter a whole number amount of cents: ");
        int input = value.nextInt();
       double temp = input / 100;
       int dollars2 = (int) temp;
       System.out.print(dollars2+" dollar(s),");
       int quarters = dollars2 - input;
        double temp2 = quarters / 25;
        int quarters2 = (int) temp2;
        System.out.print(quarters2+" quarters(s)");
        double temp3 = input / 10;
        int nickels2 = (int) temp3;
        System.out.print(nickels2+" dimes(s)");
        double temp4 = input / 5;
        int dimes2 = (int) temp4;
        System.out.print(dimes2+" nickels(s)");
        double temp5 = input / 1;
        int pennies2 = (int) temp5;
        System.out.print(pennies2+" pennies(s)");


    }
}

