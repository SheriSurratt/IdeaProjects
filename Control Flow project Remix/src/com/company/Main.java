package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        AsciiChars.printNumbers();
        AsciiChars.printUpperCase();
        AsciiChars.printUpperCase();

        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter your name");
        String firstName = userInput.nextLine();
        System.out.println("Hello" + firstName);

        System.out.println("Would you like to play a game?");
        System.out.println("Y/N: ");

        String Response = userInput.nextLine();
        switch (Response)  {
            case "y", "Y", "yes" -> System.out.println("Let's continue");
            default -> {
                System.out.println("Ok, see you later!");
                userInput.close();
            }

        }
    }
}
