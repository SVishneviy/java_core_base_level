package homework_6.animals;

public class Cat extends Animal {
    private static int countCats;

    public Cat(String name, String color, int age, int MAX_DISTANCE_RUN, int MAX_DISTANCE_SWIM) {
        super(name, color, age, MAX_DISTANCE_RUN, MAX_DISTANCE_SWIM);
        countCats++;
    }

    @Override
    public void printInformation() {
        super.printInformation();
    }

    @Override
    public void printRun(int distance) {
        if (MAX_DISTANCE_RUN != 0) {
            super.printRun(distance);
        } else {
            System.out.printf("%s не умеет бегать.\n", name);
        }
    }

    @Override
    public void printSwim(int distance) {
        if (MAX_DISTANCE_SWIM != 0) {
            super.printSwim(distance);
        } else {
            System.out.printf("%s не умеет плавать.\n", name);
        }
    }

    public static int getCountCats() {
        return countCats;
    }

}
