package com.company;

import java.util.Scanner;

public class CorrectChange
{
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.print("Please enter a whole number amount of cents: ");
        double input = value.nextInt();
       double temp = input / 100;
       int dollars2 = (int) temp;
       System.out.print(dollars2+ " dollar(s), ");

       double quartersa = temp - dollars2;
             double quartersb = quartersa / 25;
             double quartersc = quartersb * 100;
             int quart = (int)quartersc;
        System.out.print(quart+" quarters(s), ");

        double dime1 =  quartersc-quart ;
        double dime2 = dime1 / 10;
        int dime = (int)dime2;
        System.out.print(dime+" dimes(s), ");

        double nick =  dime- dime2;
        double nick2 = nick * 10;
        double nick3 = nick2 / 5;
        int nickel = (int)nick3;
        System.out.print(nickel+" nickel(s), and ");


        double penn = nickel-nick3;
        int penny = (int)penn;
        System.out.print(penny+" penny(ies).");






    }
}

