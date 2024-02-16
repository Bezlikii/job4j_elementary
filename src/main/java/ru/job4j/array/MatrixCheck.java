package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        char symbol = board[row][0];
        for (int i = 1; i < board[row].length; i++) {
            if (board[row][i] != symbol) {
                result = false;
                break;
            }
        }
        return result;
    }
}
