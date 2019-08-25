package by.etc.class_task.aggregation_composition.task_three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class City {
    private String name;

    public City(String name) {
        this.name = name;
    }

    public City() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
     static City[] createCities()throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите количество городов : ");
        int len = Integer.parseInt(br.readLine());

        City[] cities = new City[len];
        for(int i = 0; i < cities.length; i++){
            System.out.println("Введите название города : "  + (i+1));
            cities[i] = new City(br.readLine());
        }
        return cities;
    }
}
