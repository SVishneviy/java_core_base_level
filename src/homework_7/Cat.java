package homework_7;

public class Cat {
    private final String name;
    private boolean satiety;
    private final int NEED_AMOUNT_FOOD;

    public Cat(String name, boolean satiety, int NEED_AMOUNT_FOOD) {
        this.name = name;
        this.satiety = satiety;
        this.NEED_AMOUNT_FOOD = NEED_AMOUNT_FOOD;
    }

    public void printEatFood(Plate plate) {
        satiety = plate.getAmountFood() > 0 && (NEED_AMOUNT_FOOD > 0 && NEED_AMOUNT_FOOD <= plate.getAmountFood());
        if (satiety) {
            plate.reduceAmountFood(NEED_AMOUNT_FOOD);
            System.out.printf("%s съел %d еды.\n", name, NEED_AMOUNT_FOOD);
        } else {
            System.out.printf("%s не смог поесть. В тарелке не хватает еды.\n", name);
        }
    }

    public void printSatiety() {
        System.out.printf("%s %s.\n",name, satiety ? "сытый" : "голодный");
    }

}
