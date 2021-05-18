package com.company;

public class Main {

    public static void main(String[] args) {
//	Decision Statements if/else Statement
        If(condition)
                statement(s);
//        declare the variable first
        int count = 44;
//        create the statement
        if (count > 20) {
//            create the string to print if condition is met
            String msg = "Count is large!";
//            print the statement if the condition is met
            System.out.println(msg);
        }
        if (count > 50) {
            String msg = "Count is Very Large!";
            System.out.println(msg);
        }
        System.out.println("Finished checking count");
// Nested Decision Statements
        int count = 44;
        if (count > 20) {
            String msg = " Count is large!";
            if (count > 50) ;
            {
                msg = msg + "\nCount is Very large!";
            }
            System.out.println(msg);
        }
        System.out.println("Finished checking count. ");
//        Complex Conditional Expressions
//        void CheckId( boolean validId, int age, boolean buyingAlc)
//        side Quiz if you want to pick this up
        {
            if (validId)
            {
                System.out.println("Valid ID presented");
                if ((age>21 && (buyingAlc))
                {
                    System.out.println("Customer legal to purchase alcohol");
                }
            }
        }
    }
//    integer library and
    int x = 30;
    if ( x< 40){
        System.out.println(" Just Print");
    }
    }

