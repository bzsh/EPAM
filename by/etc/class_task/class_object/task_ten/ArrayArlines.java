package by.etc.class_task.class_object.task_ten;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
         и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
         методами. Задать критерии выбора данных и вывести эти данные на консоль.
         Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
         Найти и вывести:
         a) список рейсов для заданного пункта назначения;
         b) список рейсов для заданного дня недели;
         c) список рейсов для заданного дня недели, время вылета для которых больше заданного.*/

public class ArrayArlines {
    Airline[] airlines;

    public ArrayArlines(Airline[] airlines) {

    }

    public ArrayArlines() throws IOException {
        airlines = createAirlines();
    }

    public Airline[] getAirlines() {
        return airlines;
    }

    public void setAirlines(Airline[] airlines) {
        this.airlines = airlines;
    }

    private Airline[] createAirlines() throws IOException {
        Airline[] airlines;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите количество авиакомпаний: ");
        int quantity = Integer.parseInt(br.readLine());

        airlines = new Airline[quantity];

        for (int i = 0; i < airlines.length; i++) {
            System.out.print("Введите пункт назначения: ");
            String destination = br.readLine();
            System.out.print("Введите номер рейса: ");
            int flightNumber = Integer.parseInt(br.readLine());
            System.out.print("Введите тип самолета: ");
            String planeType = br.readLine();
            System.out.print("Введите время вылета: ");
            String time = br.readLine();
            System.out.print("Введите дни недели: ");
            String string = br.readLine();
            String[] days = string.split("(\\s | ,)");

            airlines[i] = new Airline(destination, flightNumber, planeType, time, days);
        }return airlines;
    }

    public void printAirlines(){
        for(Airline airline : airlines ){
            System.out.println(airline.toString());
        }
    }

    public void printByDestination() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ВВедите пункт назначения: ");
        String destination = br.readLine();

        for (int i = 0; i < airlines.length; i++) {
            if (airlines[i].getDestination().equals(destination)) {
                System.out.println(airlines[i]);
            }
        }
    }

    public void printByDayAndTime()throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ВВедите день недели: ");
        String day = br.readLine();
        System.out.println("ВВедите время: ");
        String time = br.readLine();

        for (int i = 0; i < airlines.length; i++) {
            for (int j = 0; j < airlines[i].getDays().length; j++) {
                if(day.equals(airlines[i].getDays()[j])) {
                    if(airlines[i].getTime().compareTo(time) > 0) {
                        System.out.println(airlines[i]);
                        break;
                    }

                }
            }
        }
    }

    public void printByDay()throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ВВедите день недели: ");
        String day = br.readLine();

        for (int i = 0; i < airlines.length; i++) {
            for (int j = 0; j < airlines[i].getDays().length; j++) {
                if(day.equals(airlines[i].getDays()[j])) {
                    System.out.println(airlines[i]);
                    break;
                }
            }
        }
    }
}
