package homework_6;

import homework_6.animals.Animal;
import homework_6.animals.Cat;
import homework_6.animals.Dog;

public class Main {

    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("Мурзик", "белый", 2, 200, 0),
                new Cat("Рыжик", "рыжий", 5, 200, 0),
                new Dog("Бобик", "чёрный", 3, 500, 10),
                new Dog("Рекс", "коричневый", 6, 500, 10),
                new Dog("Марли", "белый", 1, 500, 10)
        };

        for (Animal animal : animals) {
            animal.printInformation();
            animal.printRun((int) (Math.random() * 510));
            animal.printSwim((int) (Math.random() * 20));
        }

        System.out.printf("Всего котов: %d.\n", Cat.getCountCats());
        System.out.printf("Всего собак: %d.\n", Dog.getCountDogs());
        System.out.printf("Всего животных: %d.\n", Animal.getCountAnimals());
    }

}
