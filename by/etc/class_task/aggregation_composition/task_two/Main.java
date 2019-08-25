package by.etc.class_task.aggregation_composition.task_two;

/* Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
         менять колесо, вывести на консоль марку автомобиля.*/

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Car car = new Car();
        car.setModel("Ferrari");
        System.out.println(car.getModel());
        car.move();
        car.fuelCar();
        car.move();
        car.fuelCar();
        Wheel newWheel = new Wheel(15, "Goodyear");
        Wheel oldWheel = car.changeWheel(newWheel);

        System.out.println(newWheel.toString());
        System.out.println(oldWheel.toString());
    }
}
