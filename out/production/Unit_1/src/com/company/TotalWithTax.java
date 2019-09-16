package com.company;

public class TotalWithTax {
    public static void main(String[] args)
    {
        double TAXRATE = 0.0825;
        double price = 52.75;
        double tax =  price * TAXRATE;
        double totalCost = tax + price;
System.out.println("Price: $" + price);
        System.out.println("Sales Tax: $" + tax);
        System.out.print("Total: $" + totalCost);





    }
}
