package by.etc.basics.loops;

import java.math.BigInteger;

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
