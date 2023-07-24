package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {

        int rsl = 0;
        if (isValid(x1, y1) && isValid(x2, y2)) {
            if (Math.abs(x2 - x1) == Math.abs(y2 - y1)) {
                rsl = Math.abs(x2 - x1);
            }
        }
        return rsl;
    }

    private static boolean isValid(int coordinateX, int coordinateY) {
        return (coordinateX >= 0 && coordinateX <= 7) && (coordinateY >= 0 && coordinateY <= 7);
    }
}
