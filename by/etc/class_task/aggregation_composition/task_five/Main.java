package by.etc.class_task.aggregation_composition.task_five;

/*Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
        различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
        возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.*/

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        TravelCompany tc = new TravelCompany();
        tc.makeOrder();
        tc.selectByTour(TypeOfTour.REST);
        tc.sort();
        tc.printToures();
    }
}
