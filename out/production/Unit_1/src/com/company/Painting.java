package com.company;

public class Painting {
    public static void main(String[] args) {
   final int max_paint = 350;
        int length = 32;
        int width = 40;
        int height = 16;
        int door = 20;
        int window = 15;
        int one_surfacewall = height * length * 2;
                int two_surfacewall = height * width * 2;
                        int area = one_surfacewall + two_surfacewall;
   int surface_doorwin = door * 2 + window * 4;
int total_room = area
        - surface_doorwin;
System.out.println(total_room / max_paint);
System.out.println("You get 6 gallons of paint");
    }
}
