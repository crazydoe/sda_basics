package com.michal.basics.exercise_ticTacToe;

import java.util.Scanner;

public class Game {
    private Board board;
    private Scanner scanner;

    public Game() {
        this.scanner = new Scanner(System.in);
        this.board = new Board();
    }

    public void play() {
        char currentPlayer = 'X';
        while(!board.isEndGame()) {
            System.out.println(currentPlayer + " turn");
            printBoard();
            System.out.print("x: ");
            int xPos = Integer.parseInt(scanner.nextLine());
            System.out.print("y: ");
            int yPos = Integer.parseInt(scanner.nextLine());

            if(board.setSign(currentPlayer, --xPos, --yPos)) {
                System.out.println(currentPlayer + "WINS!");
                break;
            }
            currentPlayer = currentPlayer == 'X' ? 'O' : 'X';
        }
        System.out.println("NO ONE WINS");
    }

    private void printBoard() {
        char[][] board = this.board.getBoard();
        System.out.println("\t1\t2\t3\t");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + 1 + "\t");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[j][i] + "\t");
            }
            System.out.println();
        }
    }
}
