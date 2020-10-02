package homework_3;

import java.util.Random;
import java.util.Scanner;

public class Main_1 {

    private final static Scanner scanner = new Scanner(System.in);
    private final static Random random = new Random();

    public static void main(String[] args) {
        boolean inGame = true;
        while (inGame) {
            System.out.println("===== Угадай число! =====");
            System.out.println("Сейчас компьютер загадает число от 0 до 9");
            System.out.println("Начинайте угадывать!");
            int bound = 10;
            int randomNumber = random.nextInt(bound);
            boolean gameWin = checkAnswer(randomNumber);
            if (gameWin) {
                System.out.println("Вы выйграли!");
            } else {
                System.out.println("Вы проиграли!");
            }
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            int answer = scanner.nextInt();
            inGame = answer == 1;
        }
    }

    private static boolean checkAnswer(int randomNumber) {
        int countAttempts;
        for (int i = 1; i <= 3; i++) {
            int answer = scanner.nextInt();
            if (answer == randomNumber) {
                return true;
            } else {
                if (answer < randomNumber) {
                    System.out.println("Загаданное число больше " + answer);
                } else {
                    System.out.println("Загаданное число меньше " + answer);
                }
                countAttempts = 3 - i;
                System.out.println("Осталось попыток: " + countAttempts);
            }
        }
        return false;
    }

}
