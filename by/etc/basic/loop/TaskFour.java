package by.etc.basic.loop;

import java.math.BigInteger;

/*
 Составить программу нахождения произведения квадратов первых двухсот чисел.
*/

public class TaskFour {

    public static void main(String[] args) {

        task();
    }

    private static void task() {

        BigInteger result = new BigInteger("1");

        for (int i = 1; i <= 200; i++) {

            result = result.multiply(new BigInteger(String.valueOf(i * i)));
        }

        System.out.println(result);
    }
}
