package by.etc.class_task.class_object.task_ten;

/* Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
         и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
         методами. Задать критерии выбора данных и вывести эти данные на консоль.
         Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
         Найти и вывести:
         a) список рейсов для заданного пункта назначения;
         b) список рейсов для заданного дня недели;
         c) список рейсов для заданного дня недели, время вылета для которых больше заданного.*/

import java.util.Arrays;

public class Airline {
    private String destination;
    private int flightNumber;
    private String planeType;
    private String time;
    private String[] days;

    public Airline(String destination, int flightNumber, String planeType, String time, String[] days) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.planeType = planeType;
        this.time = time;
        this.days = days;
    }

    public Airline() {
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String[] getDays() {
        return days;
    }

    public void setDays(String[] days) {
        this.days = days;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "destination='" + destination + '\'' +
                ", flightNumber=" + flightNumber +
                ", planeType='" + planeType + '\'' +
                ", time='" + time + '\'' +
                ", days=" + Arrays.toString(days) +
                '}';
    }
}
