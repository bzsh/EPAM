package by.etc.final_task.task_four;

/*
Задание 4. Многопоточность. Порт . Корабли заходят в порт для
разгрузки/загрузки контейнеров. Число контейнеров, находящихся в текущий момент
в порту и на корабле, должно быть неотрицательным и непревышающим заданную
грузоподъемность судна и вместимость порта. В порту работает несколько причалов.
У одного причала может стоять один корабль. Корабль может загружаться у причала
или разгружаться.
*/

public class Main {
    public static void main(String[] args) throws InterruptedException{
        Port port = new Port();

        Ship sh1 = new Ship();
        Ship sh2 = new Ship();
        Ship sh3 = new Ship();
        Ship sh4 = new Ship();
        Ship sh5 = new Ship();

        Thread ship1 = new Thread(sh1);
        Thread ship2 = new Thread(sh2);
        Thread ship3 = new Thread(sh3);
        Thread ship4 = new Thread(sh4);
        Thread ship5 = new Thread(sh5);

        ship1.start();
        ship2.start();
        ship3.start();
        ship4.start();
        ship5.start();

        Thread.sleep(5000);


    }
}
