package com.company;

public class Painting {
    public static void main(String[] args) {
   final int max_paint = 350;
        int length = 32;
        int width = 40;
        int height = 16;
        int door = 20;
        int window = 15;
        int total_surfacewall = height * length;
       int surface_room = total_surfacewall * 4 ;
   int surface_doorwin = door * 2 + window * 4;
int total_room = surface_room - surface_doorwin;
System.out.println( total_room / max_paint);
System.out.println();
    }
}
