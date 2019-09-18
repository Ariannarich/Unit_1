package com.company;

import java.util.Scanner;

public class FindTheAverage
{
    public static void main(String[] args)
    {
        System.out.println("Enter four values");
        Scanner value = new Scanner(System.in);
        double input;
        double total = 0;
        System.out.print("Value 1: ");
        input = value.nextDouble();
        total+= input;
        System.out.print("Value 2: ");
        input = value.nextDouble();
        total+= input;
        System.out.print("Value 3: ");
        input = value.nextDouble();
        total+= input;
        System.out.print("Value 4: ");
        input = value.nextDouble();
        total+= input;
        double average;
        average = total / 4;
        System.out.println("Average = " +average);
    }
}

