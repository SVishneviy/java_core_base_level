package homework_1;

public class Main {

    // 1. Создать пустой проект в IntelliJ IDEA и прописать метод main().
    public static void main(String[] args) {
        // 2. Создать переменные всех пройденных типов данных, и инициализировать их значения.
        byte var1 = 10;
        short var2 = 100;
        int var3 = 1000;
        long var4 = 1000000000L;
        float var5 = 100000000000F;
        double var6 = 10.10;
        char var7 = '\u1111';

        // Написал так, чтобы чисто убрать подсветку о том, что переменная "var8" всегда true.
        boolean var8 = Boolean.getBoolean("true"); // boolean var8 = true;
        String var9 = "Hello, World!";

        // Написал так, чтобы чисто убрать подсветку о том, что переменные не используются
        System.out.printf("2. %d, %d, %d, %d, %.2f, %.2f, %s, %s, %s \n",
                var1, var2, var3, var4, var5, var6, var7, var8, var9);

        // 3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
        // где a, b, c, d – входные параметры этого метода.
        int var11 = 2;
        int var12 = 6;
        int var13 = 8;
        int var14 = 4;
        int resultEvaluateExpression = evaluateExpression(var11, var12, var13, var14);
        System.out.printf("3. %d * (%d + (%d / %d)) = %d \n",
                var11, var12, var13, var14, resultEvaluateExpression);

        // 4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит
        // в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
        double var21 = 2.02;
        double var22 = 7.98;
        boolean resultCheckSum = checkSum(var21, var22);
        System.out.println("4. " + resultCheckSum);


        // 5. Написать метод, которому в качестве параметра передается целое число,
        // метод должен напечатать в консоль положительное ли число передали, или отрицательное;
        // Замечание: ноль считаем положительным числом.
        int var31 = 1;
        checkPositiveNegativeNumber(var31);


        // 6. Написать метод, которому в качестве параметра передается целое число,
        // метод должен вернуть true, если число отрицательное.
        int var41 = -1;
        System.out.println("6. " + checkNegativeNumber(var41));

        // 7. Написать метод, которому в качестве параметра передается строка, обозначающая имя,
        // метод должен вывести в консоль сообщение «Привет, указанное_имя!».
        String name = "Фанзиль Кусяпкулов";
        printHelloUsername(name);

        // 8. Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль.
        // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
        int year = 2020;
        checkLeapYear(year);
    }

    /**
     * 3. Метод вычисляет выражение a * (b + (c / d)) и возвращает его результат.
     * @param a int
     * @param b int
     * @param c int
     * @param d int
     * @return int
     */
    private static int evaluateExpression(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    /**
     * 4. Метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно).
     * @param a int
     * @param b int
     * @return int
     */
    private static boolean checkSum(double a, double b) {
        double sum = a + b;
        boolean result = false;
        if(sum >= 10 && sum <= 20) {
            result = true;
        }
        return result;
    }

    /**
     * 5. Метод выводит в консоль положительное ли число передали, или отрицательное.
     * @param a int
     */
    private static void checkPositiveNegativeNumber(int a) {
        System.out.printf("5. %d - %s число \n", a, a >= 0 ? "положительное" : "отрицательное");
    }

    /**
     * 6. Метод возвращает true, если передали отрицательное число.
     * @param a int
     * @return boolean
     */
    private static boolean checkNegativeNumber(int a) {
        return a < 0;
    }

    /**
     * 7. Метод выводит в консоль «Привет, переданное_значение!».
     * @param name string
     */
    private static void printHelloUsername(String name) {
        System.out.printf("7. Привет, %s! \n", name);
    }

    /**
     * 8. Метод, который определяет является ли год високосным, и выводит сообщение в консоль.
     * @param year int
     */
    private static void checkLeapYear(int year) {
        boolean leapYear = false;
        if (year % 400 == 0 || year % 4 == 0) {
            leapYear = true;
        }
        System.out.printf("8. %d год - %s", year, leapYear ? "високосный" : "невисокосный");
    }

}
