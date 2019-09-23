package com.company;

import java.util.Scanner;

    public class RoundingTenth {
        public static void main(String[] arg)
        {

            System.out.print("Enter your number here: ");
            Scanner value = new Scanner(System.in);
            double input;
            input = value.nextDouble();
            double num1 = input * 10;
            double num2 = num1 + 0.5;
            double temp2 = (int) num2;
            double answer = temp2/ 10;

            System.out.println( (input  ) + " rounded to the nearest tenth: " + answer);

        }
    }



