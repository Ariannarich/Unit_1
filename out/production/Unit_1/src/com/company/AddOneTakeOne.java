package com.company;

import java.util.Scanner;

public class AddOneTakeOne
{
    public static void main(String[] args)
    {

    Scanner value= new Scanner(System.in);
   System.out.print("Enter a number: ");
    int num = value.nextInt();
      int temp = --num;
      System.out.print(temp);
        temp = ++num;
        System.out.print(" "+ temp);
        temp = ++num;
        System.out.print(" "+ temp);
}
}
