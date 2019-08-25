package by.etc.basic.loop;

import static java.lang.Math.pow;


/* Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
заданному е. Общий член ряда имеет вид:
*/

public class TaskFive {

    public static void main(String[] args) {

        task(0.1, 20);
    }

    private static void task(double e, int n) {

        double a;
        double sum = 0;

        for (int i = 1; i <= n; i++) {

            a = (1 / pow(2, i)) + (1 / pow(3, i));

            if (a >= e) {

                sum = sum + a;
            }
        }

        System.out.print(sum);
    }
}
