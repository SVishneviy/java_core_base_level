package homework_5;

public class Employee {
    String name;
    String position;
    String email;
    String phoneNumber;
    int salary;
    int age;

    public Employee(String name, String position, String email, String phoneNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void information() {
        System.out.printf("| %-15s | %-15s | %-25s | %-15s | %-15d | %-15d |",
                name, position, email, phoneNumber, salary, age);
        System.out.println();
    }

}

