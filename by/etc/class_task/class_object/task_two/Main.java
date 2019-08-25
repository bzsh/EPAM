package by.etc.class_task.class_object.task_two;

public class Main {
    public static void main(String[] args) {
        Test2 test1 = new Test2();
        Test2 test2 = new Test2(5,9);

        System.out.println("x = " + test1.getX() + ", y = " + test1.getY());
        System.out.println("x = " + test2.getX() + ", y = " + test2.getY());

    }
}
