package by.etc.oop.task_three;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить информацию о
        выходных и праздничных днях.*/


public class Calendar {
    String month;
    ArrayList<FreeDay> freeDays;

    public Calendar(String month, int days) { // название месяца, количество выходных
        this.month = month;
        freeDayCreator(days);
    }

    private void freeDayCreator(int days){
        freeDays = new ArrayList<FreeDay>(days);
        for(int i = 0; i < days; i++){
            freeDays.add(getInfofromUser(days));
        }
    }

    private FreeDay getInfofromUser(int days){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FreeDay freeDay = null;
        String info;
        System.out.println("Введите через зяпятую тип выходного дня(выходной/праздничный), имя выходного или праздника, число выходного/праздничного дня." );

        try{
            info = br.readLine();
        String[] strings = info.split(",");
        Type type = strings[0].toUpperCase().contains("ВЫХОДНОЙ") ? Type.DAYOFF : Type.HOLYDAY;
        freeDay = new FreeDay(type, strings[1],strings[2]);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return freeDay;
    }

    public void printFreeDays(){
        System.out.println("Месяц " + month + "\n Количество свободных дней " + freeDays.size() + "\n\n");
        for(FreeDay freeDay : freeDays){
            System.out.println(freeDay.toString());
        }
    }

    private class FreeDay {
        Type type;
        String name;
        String when;

        public FreeDay(Type type, String name, String when) {
            this.type = type;
            this.name = name;
            this.when = when;
        }

        @Override
        public String toString() {
            return when + " " + name + " " +  type.toString() + ".";
        }
    }

    private enum Type{
        HOLYDAY("Праздничный день"),
        DAYOFF("Выходной");

        private String title;

        Type(String title){
            this.title = title;
        }

        public String getTitle() {
            return title;
        }

        @Override
        public String toString() {
            return title;
        }
    }
}
