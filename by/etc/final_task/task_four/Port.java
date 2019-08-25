package by.etc.final_task.task_four;
import java.util.ArrayList;

 public class Port {
     private static ArrayList<Dock> docks = new ArrayList<>();

     public Port() {
         System.out.println("Создан порт, в порту 5 причалов");

         for(int i = 0; i < 5; i++){
             docks.add(new Dock(i));
         }
         for(Dock dock : docks){
             System.out.println(dock.toString());
         }
     }

     public synchronized static Dock getDockToLoad() {
         Dock temp = null;
         for(Dock dock : docks){
             if(dock.getContainers() < 20) {
                  temp = dock;
             }
         }
         return temp;
     }

     public synchronized static Dock getDockToUnLoad() {
         Dock temp = null;
         for(Dock dock : docks){
             if(dock.getContainers() > 0) {
                 temp = dock;
             }
         }
         return temp;
     }
 }
