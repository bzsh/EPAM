package by.etc.basic.branching;

import static java.lang.Math.pow;

/* Вычислить значение функции:*/

public class TaskFive {

    public static void main(String[] args) {

        task(12.3);
    }

    private static void task(double x) {

        if (x <= 3) {
            System.out.println(pow(x, 2) - 3 * x + 9);
        } else {
            System.out.println(1 / (pow(x, 3) + 6));
        }
    }
}

