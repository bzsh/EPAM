package by.etc.oop.task_five;

public class Package {
    private int capacity;
    private String color;

     Package(int capacity, String color) {
        this.capacity = capacity;
        this.color = color;
    }

     int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

     String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
