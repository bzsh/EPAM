package by.etc.oop.task_four;

import java.util.ArrayList;

 class Dragon {
    private Cave cave;


     Dragon() {
        this.cave = Cave.getInstance();
    }

     void printTreasures(){
        ArrayList<Cave.Treasure> treasures = cave.getTreasures();

        for(Cave.Treasure treasure : treasures){
            System.out.println(treasure.toString());
        }
    }

    Cave.Treasure getExpensiveTreasure(){  // выбор самого дорогого по стоимости сокровища
        ArrayList<Cave.Treasure> treasures = cave.getTreasures();
        Cave.Treasure mostExpensive  = treasures.get(0);

        for(Cave.Treasure treasure : treasures){
            if(mostExpensive.compareTo(treasure) < 0){
                mostExpensive = treasure;
            }
        }
         return mostExpensive;
    }

     ArrayList<Cave.Treasure> getTreasuresByInterval(int cost){  // выбор сокровищ на заданную сумму
         ArrayList<Cave.Treasure> treasures = cave.getTreasures();
         ArrayList<Cave.Treasure> list = new ArrayList<Cave.Treasure>();


         for(Cave.Treasure treasure : treasures){
             if(treasure.getCost() <= cost){
                 list.add(treasure);
             }
         }
         return list;
     }



}
