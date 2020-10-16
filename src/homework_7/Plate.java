package homework_7;

public class Plate {
    private int amountFood;

    public Plate(int amountFood) {
        this.amountFood = amountFood;
    }

    public int getAmountFood() {
        return amountFood;
    }

    public void addFood(int food) {
        amountFood += food;
    }

    public void reduceAmountFood(int food) {
        amountFood -= food;
    }

}
