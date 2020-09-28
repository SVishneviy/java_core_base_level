package homework_2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        // С помощью цикла и условия заменить 0 на 1, 1 на 0.
        int[] array1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        changeElementInArrayZeroForOneAndOneForZero(array1);

        // 2. Задать пустой целочисленный массив размером 8.
        // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21.
        int[] array2 = new int[8];
        fillArrayByAddingPlusThreeToNextElement(array2);

        // 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
        // и числа меньшие 6 умножить на 2.
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiplyOnTwoIfElementLessSix(array3);

        // 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами.
        int[][] array4 = new int[5][5];
        fillDiagonalElementsInArrayOnes(array4);

        // 5. Задать одномерный массив и найти в нем минимальный и максимальный элементы.
        int[] array5 = {4, 10, 2, -1, 23, 3, 7, 6, 40, 11, 9};
        findMinAndMaxElementInArray1(array5); // Простой способ.
        findMinAndMaxElementInArray2(array5); // С применением сортировки методом "Пузырька", если не ошибаюсь.

        // 6. Написать метод, в который передается не пустой одномерный целочисленный массив,
        // метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
        // Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
        // граница показана символами ||, эти символы в массив не входят.
        int[] array6 = {4, 3, 2, 1, 1, 2, 3, 6};
        int elementsToLeft = 5;
        boolean result = checkBalance(array6, elementsToLeft);
        System.out.println("6. " + result);

        // 7. Написать метод, которому на вход подается одномерный массив и число n (может быть положительным,
        // или отрицательным), при этом метод должен сместить все элементы массива на n позиций.
        // Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
        // Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ];
        // [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
        // При каком n в какую сторону сдвиг можете выбирать сами.
        int[] array7 = {3, 5, 6, 1};
        int n = 1;
        shiftElementsInArrayForNPosition(array7, n);
    }

    /**
     * 1. Метод заменяет в массве элементы с 0 на 1, 1 на 0.
     * @param array целочисленный массив, состоящий из элементов 0 и 1
     */
    private static void changeElementInArrayZeroForOneAndOneForZero(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else if (array[i] == 1) {
                array[i] = 0;
            }

        }
        System.out.println("1. " + Arrays.toString(array));
    }

    /**
     * 2. Метод заполняет массив значениями 0 3 6 9 12 15 18 21.
     * @param array пустой целочисленный массив
     */
    private static void fillArrayByAddingPlusThreeToNextElement(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = temp;
            temp += 3;
        }
        System.out.println("2. " + Arrays.toString(array));
    }

    /**
     * 3. Метод обходит массив и числа меньшие 6 умножает на 2.
     * @param array одномерный целочисленный массив
     */
    private static void multiplyOnTwoIfElementLessSix(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }
        System.out.println("3. " + Arrays.toString(array));
    }

    /**
     * 4. Метод заполняет диагональные элементы единицами.
     * @param array квадратный двумерный целочисленный массив
     */
    private static void fillDiagonalElementsInArrayOnes(int[][] array) {
        System.out.println("4.");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i] == array[j] || i + j == array.length - 1) {
                    array[i][j] = 1;
                }
                System.out.printf("%-3s", array[i][j]);
            }
            System.out.println();
        }
    }

    /**
     *  5. Метод сортирует массив и находит в нем минимальный и максимальный элементы.
     * @param array одномерный целочисленный массив
     */
    private static void findMinAndMaxElementInArray1(int[] array) {
        Arrays.sort(array);
        System.out.println("5. " + Arrays.toString(array));
        System.out.println("Минимальный элемент: " + array[0]);
        System.out.println("Максимальный элемент: " + array[array.length - 1]);
    }

    /**
     *  5. Метод сортирует массив и находит в нем минимальный и максимальный элементы.
     * @param array одномерный целочисленный массив
     */
    private static void findMinAndMaxElementInArray2(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("5. " + Arrays.toString(array));
        System.out.println("Минимальный элемент: " + array[0]);
        System.out.println("Максимальный элемент: " + array[array.length - 1]);
    }

    /**
     * 6. Метод сравнивает сумма левой и правой части массива. Возвращает true, если суммы равны, иначе false.
     * @param array одномерный целочисленный массив
     * @param elementsToLeft сколько взять элементов слева
     * @return boolean
     */
    private static boolean checkBalance(int[] array, int elementsToLeft) {
        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 0; i < array.length; i++) {
            if (i <= elementsToLeft - 1) {
                sumLeft += array[i];
            } else {
                sumRight += array[i];
            }
        }
        return sumLeft == sumRight;
    }

    /**
     * 7. Метод смещает все элементы массива на n позиций. Если n >= 0 элементы сдвигаеются вправо, иначе влево.
     * @param array одномерный целочисленный массив
     * @param n на какое количество сдвинуть элементы.
     */
    private static void shiftElementsInArrayForNPosition(int[] array, int n) {
        int shift = n % array.length;
        if (n > 0) {
            for (int i = 0; i < shift; i++) {
                for (int j = 0; j < array.length; j++) {
                    int nextElement = array[j];
                    array[j] = array[0];
                    array[0] = nextElement;
                }
            }
        } else {
            for (int i = shift; i < 0; i++) {
                for (int j = array.length - 2; j >= 0; j--) {
                    int nextElement = array[j];
                    array[j] = array[array.length-1];
                    array[array.length-1] = nextElement;
                }
            }
        }
        System.out.println("7. " + Arrays.toString(array) + ". Смещено на " + n + " позиций.");
    }

}
