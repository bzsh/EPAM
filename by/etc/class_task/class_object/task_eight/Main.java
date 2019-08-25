package by.etc.class_task.class_object.task_eight;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        CustomersArray ca = new CustomersArray();
        ca.print();
        ca.lexicalSort();
        ca.print();
        ca.printByInterval();
    }
}
