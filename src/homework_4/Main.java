package homework_4;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static int SIZE = 5;
    public static int DOTS_TO_WIN = 4;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static char[][] map;
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }

    public static boolean checkWin(char symbol) {
        for (int i = 0; i < SIZE - 3; i++) {
            for (int j = 0; j < SIZE - 3; j++) {
                if (checkLines(i, j, symbol) || checkDiagonals(i, j, symbol)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    public static boolean checkLines(int i, int j, char symbol) {
        for (int k = i; k < DOTS_TO_WIN + i; k++) {
            boolean line_1 = true;
            boolean line_2 = true;
            for (int g = j; g < DOTS_TO_WIN + j; g++) {
                line_1 = line_1 & (map[k][g] == symbol);
                line_2 = line_2 & (map[g][k] == symbol);
            }
            if (line_1 || line_2) {
                return true;
            }
        }
        return false;
    }
    public static boolean checkDiagonals(int i, int j, char symbol) {
        boolean leftDiagonal = true;
        boolean rightDiagonal = true;
        for (int k = i; k < DOTS_TO_WIN + i; k++) {
            leftDiagonal = leftDiagonal & (map[(SIZE - 1) - k][k] == symbol);
            rightDiagonal = rightDiagonal & (map[k][k] == symbol);
        }
        for (int k = j; k < DOTS_TO_WIN + j; k++) {
            leftDiagonal = leftDiagonal & (map[(SIZE - 1) - k][k] == symbol);
            rightDiagonal = rightDiagonal & (map[k][k] == symbol);
        }
        return leftDiagonal || rightDiagonal;
    }

    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (isCellValid(x, y)); // while(isCellValid(x, y) == false)
        map[y][x] = DOT_X;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return true;
        return map[y][x] != DOT_EMPTY;
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}


