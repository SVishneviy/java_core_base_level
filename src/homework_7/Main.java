package homework_7;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static boolean exit = false;

    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Мурзик", false, 10),
                new Cat("Барсик", false, 15),
                new Cat("Рыжик", false, 8),
                new Cat("Пушистик", false, 20),
                new Cat("Дымок", false, 18)
        };
        System.out.println("Для начала укажите сколько еды в тарелке:");
        int food = enterAndCheckNextInt();
        Plate plate = new Plate(food);
        while (!exit) {
            printMenu();
            switch (scanner.nextInt()) {
                case 1:
                    for (Cat cat : cats) {
                        cat.printEatFood(plate);
                    }
                    break;
                case 2:
                    for (Cat cat : cats) {
                        cat.printSatiety();
                    }
                    break;
                case 3:
                    System.out.println("Сколько добавить еды?");
                    int addFood = enterAndCheckNextInt();
                    plate.addFood(addFood);
                    System.out.printf("Добавлено %d еды.\n", addFood);
                    break;
                case 4:
                    System.out.printf("В тарелке %d еды.\n", plate.getAmountFood());
                    break;
                default:
                    exit = true;
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println();
        System.out.println("=====Выберите действие:=====");
        System.out.println("1. Покормить котов");
        System.out.println("2. Вывести сытость котов");
        System.out.println("3. Добавить еды");
        System.out.println("4. Сколько еды в тарелке");
        System.out.println("0. Выход");
        System.out.println("============================");
    }

    private static int enterAndCheckNextInt() {
        int number;
        do {
            number = scanner.nextInt();
             if (number <= 0) {
                System.out.println("Укажите число больше 0.");
            }
        } while (number <= 0);
        return number;
    }

}
