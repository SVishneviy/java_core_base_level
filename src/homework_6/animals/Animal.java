package homework_6.animals;

public abstract class Animal {
    protected String name;
    protected String color;
    protected int age;
    private static int countAnimals;
    protected final int MAX_DISTANCE_RUN;
    protected final int MAX_DISTANCE_SWIM;

    public Animal(String name, String color, int age, int MAX_DISTANCE_RUN, int MAX_DISTANCE_SWIM) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.MAX_DISTANCE_RUN = MAX_DISTANCE_RUN;
        this.MAX_DISTANCE_SWIM = MAX_DISTANCE_SWIM;
        countAnimals++;
    }

    public void printInformation() {
        System.out.printf("Имя: %s. Цвет: %s. Возраст: %d.\n", name, color, age);
    }

    public void printRun(int distance) {
        if (distance <= MAX_DISTANCE_RUN) {
            System.out.printf("%s пробежал %d метров.\n", name, distance);
        } else {
            System.out.printf("%s не может пробежать %d метров. Максимально допустимое расстояние: %d.\n",
                    name, distance, MAX_DISTANCE_RUN);
        }
    }

    public void printSwim(int distance) {
        if (distance <= MAX_DISTANCE_SWIM) {
            System.out.printf("%s проплыл %d метров.\n", name, distance);
        } else {
            System.out.printf("%s не может проплыть %d метров. Максимально допустимое расстояние: %d.\n",
                    name, distance, MAX_DISTANCE_SWIM);
        }
    }

    public static int getCountAnimals() {
        return countAnimals;
    }

}
