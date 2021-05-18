package com.company;
import java.util.Scanner;
//added the public class notBuyingAlc
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//
//        declared the validId & age variable
        int validId = 21;
        int age;
        int notBuyingAlc;
        if (validId >= 21) {
            System.out.println("Valid Id NOT Presented");
        }


        if (validId < 21)
        {
            System.out.println("Customer is not of legal age");
        }
    }
}








