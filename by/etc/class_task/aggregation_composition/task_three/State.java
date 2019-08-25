package by.etc.class_task.aggregation_composition.task_three;

/*. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
        столицу, количество областей, площадь, областные центры.*/

import java.io.IOException;

public class State {

    private Region[] regions;
    private String stateName;
    private String capital;
    private int square;

    public State(String stateName, String capital, int square) throws IOException {
        this.regions = Region.createRegions();
        this.stateName = stateName;
        this.capital = capital;
        this.square = square;
    }

    public State( Region[] regions, String stateName,  String capital, int square) {
        this.regions = regions;
        this.stateName = stateName;
        this.capital = capital;
        this.square = square;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public Region[] getRegions() {
        return regions;
    }

    public void setRegions(Region[] regions) {
        this.regions = regions;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public void printRegionQuantitu() {
        System.out.println("Количество областей : " + regions.length);
    }

    public void printCapital() {
        System.out.println("Столица : " + capital);
    }

    public void printSquare() {
        System.out.println("Пложащь равна : " + square + " квадратных киллометров");
    }

    public void printRegionsCenters() {
        System.out.print("\nОбластные центры : ");
        for (int i = 0; i < regions.length; i++) {
            System.out.print(regions[i].getCenter() + " ");
        }
    }
}
