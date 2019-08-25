package by.etc.class_task.aggregation_composition.task_three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Area {
    private City[] cities;
    private String name;

    public Area(City[] cities, String name) {
        this.cities = cities;
        this.name = name;
    }

    public Area() {
    }

    public City[] getCities() {
        return cities;
    }

    public void setCities(City[] cities) {
        this.cities = cities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

     static Area[] createAreas()throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите количество районов : ");
        int len = Integer.parseInt(br.readLine());

        Area[] areas = new Area[len];
        for(int i = 0; i < areas.length; i++){
            System.out.println("Введите название района : " + (i+1));
            String name = br.readLine();
            System.out.println(" - Нужно внести города в этот район");
            areas[i] = new Area(City.createCities(), name);
        }
        return areas;
    }
}
