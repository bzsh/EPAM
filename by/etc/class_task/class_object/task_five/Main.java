package by.etc.class_task.class_object.task_five;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter(50);

        System.out.println(counter);
        counter.increase();
        System.out.println(counter);
        counter.decrease();
        System.out.println(counter);
        counter.setcount(200);
        System.out.println(counter);
    }
}
