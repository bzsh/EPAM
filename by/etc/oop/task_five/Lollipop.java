package by.etc.oop.task_five;

public class Lollipop implements Sweet {
    private int weight;

    public Lollipop(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return TypeOfSweet.LOLLIPOP.title + ", вес : " + weight + " г.";
    }
}
