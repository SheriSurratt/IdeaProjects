package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//      System.out.println("Hello World");
//        System.out.print("Hello, World!\n");
//        System.out.println("Today is awesome!");
//        System.out.println("... don't you think?");

//        Receiving Input fro the end user
        Scanner input = new Scanner(System.in);

        System.out.println("What is your name?");
//        in order to get the string you have to create a variable!!
        System.out.println("What is your name?");
        String firstName = input.nextLine();
        System.out.printf("Hello %s!\n", firstName );
        System.out.printf("Goodbyr %s!\n", firstName);
    }
}
