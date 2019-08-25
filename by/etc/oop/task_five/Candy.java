package by.etc.oop.task_five;

public class Candy implements Sweet {
    private int weight;

    public Candy(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return TypeOfSweet.CANDY.title + ", вес : " + weight + " г.";
    }
}
