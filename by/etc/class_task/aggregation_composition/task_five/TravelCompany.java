package by.etc.class_task.aggregation_composition.task_five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class TravelCompany {
    private ArrayList<Voucher> list = new ArrayList<>();

    public void makeOrder() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Сколько путевок вы хотели бы заказать");
        int num = Integer.parseInt(br.readLine());
        if (num > 0) {
            for (int i = 0; i < num; i++) { // public Voucher(int id, String country, TypeOfTour type, TypeOfFood food, TypeOfTransport transport)
                System.out.println("Создание путевки номер " + (i + 1));
                System.out.println("В какую страну отправитесь ?");
                String country = br.readLine();
                System.out.println("Введите тип тура из перечисленных ");
                System.out.println(TypeOfTour.getTypes());
                String type = br.readLine();
                System.out.println("Введите тип питания из перечисленных ");
                System.out.println(TypeOfFood.getTypes());
                String food = br.readLine();
                System.out.println("Введите тип транспорта из перечисленных ");
                System.out.println(TypeOfTransport.getTypes());
                String transport = br.readLine();
                list.add(new Voucher(i+1, country, TypeOfTour.valueOf(type), TypeOfFood.valueOf(food), TypeOfTransport.valueOf(transport)));
            }
            System.out.println("Количество заказанных путевок " + num + " хорошего отдыха !");
        } else {
            System.out.println("Ясно, всего хорошего ! :-)");
        }
    }


    public void selectByTour(TypeOfTour tour) {
        for (Voucher v : list) {
            if (tour.name().equals(v.getType().name())) {
                System.out.println("Путевка с типом тура : " + tour.name() + " \n" + v.toString());
            }
        }
    }

    public void sort() {
        Collections.sort(list);
    }

    public void printToures(){
        System.out.println(list.toString());
    }
}
