package homework_6;

import homework_6.animals.Animal;
import homework_6.animals.Cat;
import homework_6.animals.Dog;

public class Main {

    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Мурзик", "белый", 2, 200, 0),
                new Cat("Рыжик", "рыжий", 5, 200, 0)
        };

        Dog[] dogs = {
                new Dog("Бобик", "чёрный", 3, 500, 10),
                new Dog("Рекс", "коричневый", 6, 500, 10),
                new Dog("Марли", "белый", 1, 500, 10)
        };

        for (Cat cat : cats) {
            cat.printInformation();
            cat.printRun((int) (Math.random() * 210));
            cat.printSwim((int) (Math.random() * 5));
        }

        for (Dog dog : dogs) {
            dog.printInformation();
            dog.printRun((int) (Math.random() * 510));
            dog.printSwim((int) (Math.random() * 15));
        }

        System.out.printf("Всего котов: %d.\n", Cat.getCountCats());
        System.out.printf("Всего собак: %d.\n", Dog.getCountDogs());
        System.out.printf("Всего животных: %d.\n", Animal.getCountAnimals());
    }

}
