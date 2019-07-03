package by.etc.basic.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskOne {

    public static void main(String[] args) throws IOException {

        task();
    }

    private static void task() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int digit;

        System.out.println("Введите целое положительное число");

        digit = Integer.parseInt(reader.readLine());


        for (int i = 0; i < digit; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}
