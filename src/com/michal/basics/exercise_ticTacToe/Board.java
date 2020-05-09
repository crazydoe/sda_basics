package com.michal.basics.exercise_ticTacToe;

import java.util.Arrays;

public class Board {

    private char[][] board;
    private int moveCounter = 0;

    public Board() {
        this.board = new char[3][3];
        for (char[] chars : board) {
            Arrays.fill(chars, ' ');
        }
    }

    public boolean setSign(char xOrY, int xPosition, int yPosition) {
        char maybeFree = board[xPosition][yPosition];
        if (maybeFree != ' ') {
            return false;
        }
        if (xOrY != 'X' && xOrY != 'O') {
            return false;
        }
        board[xPosition][yPosition] = xOrY;
        moveCounter++;
        return verify();
    }

    public boolean verify() {
        boolean b = verifyDiagonal();
        boolean b1 = verifyHorizontally();
        boolean b2 = verifyVertically();
        return b || b1 || b2;
    }

    private boolean verifyDiagonal() {
        return false;
    }

    private boolean verifyVertically() {
        return false;
    }

    private boolean verifyColumn(int column) {
        return false;
    }

    private boolean verifyHorizontally() {
        for (int row = 0; row < 3; row++) {
            if (verifyRow(row)) {
                return true;
            }
        }
        return false;
    }

    private boolean verifyRow(int row) {
        char lastChar = ' ';

        for (int i = 0; i < 3; i++) {
            char character = board[row][i];
            if (character == ' ') {
                break;
            }
            if (lastChar == ' ') {
                lastChar = board[row][i];
            } else if (lastChar != board[row][i]) {
                return false;
            }
        }
        return false;
    }

    public char[][] getBoard() {
        return board;
    }

    public boolean isEndGame() {
        return !(moveCounter < 9);
    }
}
