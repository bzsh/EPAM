package by.etc.oop.task_four;

import java.util.ArrayList;
import java.util.Random;

public class Cave {
    private static Cave instance ;
    private final static int NUM_OF_TREASURES = 100;
    private ArrayList<Treasure> treasures = new ArrayList<Treasure>(NUM_OF_TREASURES);

    private Cave() {
        for(int i = 0; i < NUM_OF_TREASURES; i++){
            treasures.add(new Treasure());
        }
    }

    public static Cave getInstance() {
        if(instance == null){
            instance = new Cave();
        }
        return instance;
    }

    public ArrayList<Treasure> getTreasures() {
        return treasures;
    }

     class Treasure implements Comparable<Treasure>{
        Type type;
        int cost;

         Treasure() {
            Type[] arr = Type.values();
            Random random = new Random();

            int value = random.nextInt(arr.length);
            cost = random.nextInt(1000);
            type = arr[value];
        }

        public Type getType() {
            return type;
        }

        public void setType(Type type) {
            this.type = type;
        }

        public int getCost() {
            return cost;
        }

        public void setCost(int cost) {
            this.cost = cost;
        }

        @Override
        public int compareTo(Treasure o) {
            return this.cost - o.cost;
        }

         @Override
         public String toString() {
             return type.title + ",\t стоимость : " + cost + " руб.\n";
         }
     }
    private enum Type{
        GOLD("Золотой слиток"),
        RING("Кольцо"),
        GEM("Драгоценный каммень"),
        PERL("Жемчуг"),
        COLLAR("Ожерелье");

        private String title;

        Type(String title){
            this.title = title;
        }
    }
}
