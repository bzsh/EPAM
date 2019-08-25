package by.etc.oop.task_five;

public class Cookie implements Sweet {
    private int weight;

    public Cookie(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return TypeOfSweet.COOKIE.title + ", вес : " + weight + " г.";
    }
}
