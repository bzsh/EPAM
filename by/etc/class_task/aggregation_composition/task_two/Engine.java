package by.etc.class_task.aggregation_composition.task_two;

public class Engine {
    private int power;
    private String manufacturer;

    public Engine(int power, String manufacturer) {
        this.power = power;
        this.manufacturer = manufacturer;
    }

    public Engine() {
        this.power = 145;
        this.manufacturer = "Unknown";
    }

    public int getPower() {
        return power;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void startEngine(){
        System.out.println("Двигатель заведен");
    }

    public void stopEngine(){
        System.out.println("Двигатель заглушен");
    }
}
