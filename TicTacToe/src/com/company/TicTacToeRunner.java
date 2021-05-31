package com.company;

import java.util.Scanner;

public class TicTacToeRunner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//    Get the players name
        System.out.println("Palyerr 1,What is your name? ");
        String p1 = in.nextLine();
        System.out.println("Player 2, What is your name? ");
        String p2 = in.nextLine();

//        Tic Tac Toe board
        char [][] board = new char[3][3];

//        Fill the board with dashes
        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
//              Draw board

            }
            drawBoard(board);
        }
//            Printing out the board
            public static void drawBoard(char[][] board){
                for(int i = 0; i < 3; i++) {
                    for(int j = 0; j < 3; j++){
                        System.out.print(board[i] [j]);

            }

        }
    }
}

    private static void drawBoard(char[][] board) {
    }
