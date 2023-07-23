package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {

        if (!isValid(x1, y1) || !isValid(x2, y2)) {
            System.out.println("Координаты должны быть от 0 до 7!");
            return 0;
        }

        if (Math.abs(x2 - x1) != Math.abs(y2 - y1)) {
            System.out.println("Слон должен двигаться по диагонали!");
            return 0;
        }

        return Math.abs(x2 - x1);
    }

    private static boolean isValid(int coordinateX, int coordinateY) {
        return (coordinateX >= 0 && coordinateX <= 7) && (coordinateY >= 0 && coordinateY <= 7);
    }
}
