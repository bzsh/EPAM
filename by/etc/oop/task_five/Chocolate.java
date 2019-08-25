package by.etc.oop.task_five;

public class Chocolate implements Sweet {
    private int weight;

    public Chocolate(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return TypeOfSweet.CHOCOLATE.title + ", вес : " + weight + " г.";
    }
}
