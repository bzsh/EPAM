package by.etc.oop.task_five;

public class Gum implements Sweet {
    private int weight;

    public Gum(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return TypeOfSweet.GUM.title + ", вес : " + weight + " г.";
    }
}
