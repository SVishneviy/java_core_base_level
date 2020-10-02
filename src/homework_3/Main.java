package homework_3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);
    private final static Random random = new Random();
    private final static String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
            "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
            "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

    public static void main(String[] args) {
        String randomWord = words[random.nextInt(words.length - 1)];
        boolean answerTrue;
        System.out.println("===== Угадай слово! =====");
        System.out.println("Сейчас компьютер загадает слово из этого списка:\n" + Arrays.toString(words));
        System.out.println("Начинайте угадывать!");
        do {
            String answer = scanner.nextLine().toLowerCase();
            answerTrue = checkAnswer(randomWord, answer);
        } while (!answerTrue);
    }
    private static boolean checkAnswer(String randomWord, String answer) {
        if (randomWord.equals(answer)) {
            System.out.println("Вы угадали! Игра завершена.");
            return true;
        } else {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < randomWord.length() && i < answer.length(); i++) {
                char a = randomWord.charAt(i);
                char b = answer.charAt(i);
                if (a == b) {
                    result.append(a);
                } else {
                    result.append("#");
                }
            }
            int countAddSymbols = 15 - result.length();
            for (int i = 0; i < countAddSymbols; i++) {
                result.append("#");
            }
            System.out.println("Вы не угадали! Вот вам подсказка:\n" + result);
            return false;
        }
    }
}
