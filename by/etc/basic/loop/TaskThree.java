package by.etc.basic.loop;

/*
 Найти сумму квадратов первых ста чисел.
*/

public class TaskThree {

    public static void main(String[] args) {

        task();
    }

    private static void task() {

        int sum = 0;

        for (int i = 0; i <= 100; i++) {

            sum += i * i;
        }

        System.out.println(sum);
    }
}
