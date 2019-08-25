package by.etc.oop.task_two;

import java.io.IOException;

/*Создать класс Payment с внутренним классом,
 с помощью объектов которого можно сформировать
  покупку из нескольких товаров.*/

public class Main {
    public static void main(String[] args) throws IOException {
        Payment payment = new Payment("My first payment");
        payment.createOrder();
        payment.printPayment();
    }
}
