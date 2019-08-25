package by.etc.oop.task_three;

/*Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить информацию о
        выходных и праздничных днях.*/

public class Main {
    public static void main(String[] args) {
        Calendar calendar = new Calendar("Январь", 5);
        calendar.printFreeDays();
    }
}
