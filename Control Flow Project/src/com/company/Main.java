package com.company;

import java.util.Scanner;

class AsciiChars {
    private static Object RandomNumber;

    public static void printNumbers() {
        System.out.println("Valid number inputs:");
        for (int i = 50; i <= 52; i++) {
            System.out.println((char) i);
        }
        System.out.println();
    }

    public static void printLowerCase() {
        System.out.println("Valid lowercase inputs");
        for (int i = 105; i <= 110; i++) {
            System.out.println((char) i);

        }
        System.out.println();
    }

    public static void printUpperCase() {
        System.out.println("Valid Uppercase inputs");
        for (int i = 65; i <= 83; i++) {
            System.out.println((char) i);
        }
        System.out.println();
    }
    public static void  main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String firstName = input.nextLine();
        System.out.println("Hello" + firstName);

        System.out.print("Do you wish to continue?: ");
        System.out.print("  Y/N: ");

        String Decision = input.nextLine();
        switch (Decision) {
            case "y", "Y", "yes" -> System.out.println("Lets continue");
            default -> {
                System.out.println("Please return to complete the survey");
                input.close();
            }
        }
        System.out.println("Do you have a red car");
        System.out.print("  Y/N: ");
        String questions = input.nextLine();
        switch (questions) {
            case "y", "Y", "yes" -> System.out.println("NICE!");
            default -> System.out.println("Keep Hoping!");
        }
        System.out.println("What's your favorite pets name?");
        String petName = input.nextLine();
        System.out.println(petName + "  is such a cute name!");
        System.out.println("How old is your pet?");

        int num = input.nextInt();
        String petAge = input.next();
        input.close();

        System.out.println("What is your lucky number?");
        String favNum = input.nextLine();
        System.out.println(favNum + " , let's hope you're lucky!");

        System.out.println("Do you have a favorite quarterback?");
        System.out.print("  Y/N: ");
        String athlete = input.nextLine();
        if (athlete.equals("y")) {
            System.out.println("What is their  jersey number?");
            String jerseyNum = input.nextLine();
        }
        if (athlete.equals("Y")) {
            System.out.println("What is their number?");
            String thierNum = input.nextLine();
        }
        if (athlete.equals("N")) {
            System.out.println("Wow you should know this!.");
            String sportNum = input.nextLine();
        }
        else {
            System.out.println("come back when you can answer this question!");
        }
        System.out.println("What is two-digit model year of your car?");
        String carYr = input.nextLine();

//Favorite Actor/Actress
        System.out.println("What is the name of your favorite actor?");
        String favoriteAct = input.nextLine();
        System.out.println("I like " + favoriteAct + " too!");

        System.out.println("Enter a random number from 1 to 50");
        System.out.println();

        System.out.println("Do you want a lottery number?");
        System.out.print("  Y/N: ");
        String lotto = input.nextLine();
        if (lotto.equals("y")) {
            System.out.println("Okay, lets go");

        } else {
            System.out.println("ok bye");
        }
    }
    public static class RandomNumber {

        public static void printLottoNumber () {
            int[] lottery = new int[5];
            int randomNum;
            c1:
            for (int i = 0; i < 5; i++) {
                // Random number created here.
                randomNum = (int) (Math.random() * 65);
                if(randomNum == 0) {
                    continue c1;
                }
                for (int x = 0; x < i; x++) {
                    // Here, code checks if same random number generated before.
                    if (lottery[x] == randomNum )
                    {
                        // If random number is same, another number generated.
                        randomNum = (int) (Math.random() * 65);
                        x = -1; // restart the loop
                    }

                }
                lottery[i] = randomNum;
            }

            for (int i = 0; i < lottery.length; i++)
                System.out.print(lottery[i] + " " );
        }

    }



}







