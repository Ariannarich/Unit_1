package com.company;

import java.util.Scanner;

public class RoundNegatives {
    public static void main(String[] args)
    {
        System.out.print("Enter your negative decimal here: ");
        Scanner value = new Scanner(System.in);
        double input;
        input = value.nextDouble();
        double input2 = input - 0.5;
        int answer = (int)input2;
        System.out.print( input + " rounded to a whole number is: " + answer);
}
}