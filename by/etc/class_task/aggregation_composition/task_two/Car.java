package by.etc.class_task.aggregation_composition.task_two;

/* Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
         менять колесо, вывести на консоль марку автомобиля.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Car {

    private String model;
    private Engine engine;
    private boolean hasFuel;
    private Wheel[] wheels;
    private boolean canMove;

    public Car(String model, Engine engine, Wheel[] wheels, boolean hasFuel) {
        this.model = model;
        this.engine = engine;
        this.wheels = wheels;
        this.hasFuel = hasFuel;
    }

    public Car() {
        hasFuel = false;
        engine = new Engine();
        model = "Unknown";
        wheels = new Wheel[4];
        for(int i = 0; i < wheels.length; i++){
            wheels[i] = new Wheel();
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void move(){
        canMove = true;

        if(wheels.length < 4){
            System.out.println("Машина не поедет пока не будет 4х колес ");
            canMove = false;
        }else if(hasFuel){
            {
                for (int i = 0; i < wheels.length; i++) {
                    if (wheels[i] == null) {
                        canMove = false;
                        System.out.println("Машина не может ехать без колес ");
                    }
                }
            }
            if(canMove){
                engine.startEngine();
                System.out.println("Машина едет");
            }
        }else{
            System.out.println("Машина не поедет без топлива !");
        }
    }

    public void fuelCar(){
        if(!hasFuel){
            engine.stopEngine();
            hasFuel = true;
            System.out.println("Палялося топливо");
            System.out.println("Машина заправлена, можно ехать");
        }else {
            System.out.println("У вас есть топливо, заправка не требуется");
        }
    }

    public Wheel changeWheel(Wheel wheel) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Wheel toChange = null;

        System.out.println("Введите номер колеса из " + wheels.length + "х, для замены");
        int numOfWheel = Integer.parseInt(br.readLine());

        if(numOfWheel > 4){
            System.out.println("Нет у машины столько колес");
        }else if(wheels[numOfWheel - 1] != null){
            toChange = wheels[numOfWheel - 1 ];
            wheels[numOfWheel - 1 ] = wheel;
            System.out.println("Колесо успешно заменено, заберите старое");
        }
        return toChange;
    }
}
