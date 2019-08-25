package by.etc.algoritm.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
дополнительный массив.
*/

public class TaskOne {
    public static void main(String[] args) throws IOException {
        task();
    }

    private static void task() throws IOException {
        int l = 0;
        int k;
        int[] arrOne = new int[(int) ((Math.random() * (10 - 3 + 1) + 3))];
        int[] arrTwo = new int[(int) ((Math.random() * (10 - 3 + 1) + 3))];
        int[] arrTemp = new int[arrOne.length + arrTwo.length];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < arrOne.length; i++) {
            arrOne[i] = (int) (Math.random() * 100);
        }

        for (int i = 0; i < arrTwo.length; i++) {
            arrTwo[i] = (int) (Math.random() * 100);
        }

        System.out.println("Введите число \"k\", число не должно быть меньше 0 и больше " + (arrOne.length - 2));
        k = Integer.parseInt(reader.readLine());

        for (int i = 0; i < arrOne.length; i++) {

            arrTemp[l] = arrOne[i];
            if (i == k) {
                l = i;
                for (int j = 0; j < arrTwo.length; j++) {
                    l++;
                    arrTemp[l] = arrTwo[j];
                }
            }
            l++;
        }

        System.out.println();
        for (int i : arrOne) {
            System.out.print(i + " ");
        }

        System.out.println();
        for (int i : arrTwo) {
            System.out.print(i + " ");
        }

        System.out.println();
        for (int i : arrTemp) {
            System.out.print(i + " ");
        }
    }
}
