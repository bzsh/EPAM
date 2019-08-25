package by.etc.class_task.aggregation_composition.task_three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Region {
    private Area[] areas;
    private String name;
    private String center;

    public Region() {
    }

    public Region(Area[] areas, String name, String center) {
        this.areas = areas;
        this.name = name;
        this.center = center;
    }

    public Area[] getAreas() {
        return areas;
    }

    public void setAreas(Area[] areas) {
        this.areas = areas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCenter() {
        return center;
    }

    public void setCenter(String center) {
        this.center = center;
    }

    static Region[] createRegions()throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите количество облостей : ");
        int len = Integer.parseInt(br.readLine());

        Region[] regions = new Region[len];
        for(int i = 0; i < regions.length; i++){
            System.out.println("Введите название области : "  + (i+1));
            String name = br.readLine();
            System.out.println("Введите имя этого областного центра");
            String center = br.readLine();
            System.out.println(" - Нужно внести районы в эту область");
            regions[i] = new Region(Area.createAreas(), name, center);
        }
        return regions;
    }
}
