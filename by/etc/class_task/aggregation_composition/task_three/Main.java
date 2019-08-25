package by.etc.class_task.aggregation_composition.task_three;

/*. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
        столицу, количество областей, площадь, областные центры.*/

import java.io.IOException;

public class Main {

    public static void main(String[] args)throws IOException {
        State state = new State("State","Minsk", 600);
        state.printCapital();
        state.printRegionQuantitu();
        state.printRegionsCenters();
        state.printSquare();
    }
}
