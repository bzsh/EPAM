package by.etc.class_task.class_object.task_four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Train[] trains = new Train[5];
        int number;

        for (int i = 0; i < trains.length; i++) {
            trains[i] = new Train(("aaa" + i), i + (int)(Math.random() * 10 * i + 1), (i + ": 00"));
        }

        System.out.println("массив поездов :");
        for(Train train : trains){
            System.out.println(train.toString());
        }

        System.out.println("Введите номер поезда :");
        number = Integer.parseInt(reader.readLine());
        for(int i = 0; i < trains.length; i++){
            if(trains[i].gettrainNumber() == number){
                System.out.println(trains[i].toString());
            }
        }
        System.out.println();

        for (int i = trains.length - 1; i > 0; i--) {
            Train temp;
            for (int j = 0; j < i; j++) {
                if (trains[i - 1].gettrainNumber() > trains[i].gettrainNumber()) {
                    temp = trains[j];
                    trains[j] = trains[j + 1];
                    trains[j + 1] = temp;
                }
            }
        }
        System.out.println("Массив поездов после сортировки по номерам поездов");
        for(Train train : trains){
            System.out.println(train.toString());
        }

        trains[1].setDestination("aaa4");
        Arrays.sort(trains);

        System.out.println("Массив поездов после сортировки по пунктам назначения");
        for(Train train : trains){
            System.out.println(train.toString());
        }
    }
}
