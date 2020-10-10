package homework_5;

public class Main {

    public static void main(String[] args) {
        Employee[] employees = new Employee[] {
                new Employee(
                        "Иван Иванов",
                        "Инженер",
                        "ivan_ivanov@mail.ru",
                        "89374672398",
                        30000,
                        25),
                new Employee(
                        "Василий Пупкин",
                        "Стажёр",
                        "vasiliy_pupkin@mail.ru",
                        "89171021141",
                        15000, 22),
                new Employee(
                        "Андрей Андреев",
                        "Директор",
                        "andrey_andreev@mail.ru",
                        "89274934490",
                        150000,
                        42),
                new Employee(
                        "Семён Семёнов",
                        "Бухгалтер",
                        "semen_semenov@mail.ru",
                        "89672319867",
                        35000,
                        37),
                new Employee(
                        "Захар Захаров",
                        "Администратор",
                        "zakhar_zakharov@mail.ru",
                        "89274324765",
                        25000,
                        44),
        };
        System.out.println("_______________________________________________________________________________________________________________________");
        System.out.printf("| %-15s | %-15s | %-25s | %-15s | %-15s | %-15s |",
                "Имя", "Должность", "Почта", "Телефон", "Зарплата", "Возраст");
        System.out.println();
        System.out.println( "_______________________________________________________________________________________________________________________");
        for (Employee employee: employees) {
            if (employee.age > 40) {
                employee.information();
            }
        }
        System.out.println("_______________________________________________________________________________________________________________________");
    }

}

