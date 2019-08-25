package by.etc.class_task.aggregation_composition.task_two;

public class Wheel {
    private int radius;
    private String manufacturer;

    public Wheel(int radius, String manufacturer) {
        this.radius = radius;
        this.manufacturer = manufacturer;
    }

    public Wheel() {
        this.radius = 15;
        this.manufacturer = "Unknown";
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "radius=" + radius +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
