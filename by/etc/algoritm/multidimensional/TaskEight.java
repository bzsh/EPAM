package by.etc.algoritm.multidimensional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskEight {

    public static void main(String[] args)throws IOException {
        task(10);
    }

    private static void task(int n) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a;
        int b;
        int temp;

        int arr[][] = new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) ((Math.random() * 200) - 100);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] >= 0 ? " " : "");
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Введите номера 2х столбцов в пределах от 0 до " + (n-1));
        a = Integer.parseInt(reader.readLine());
        b = Integer.parseInt(reader.readLine());
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            temp = arr[i][a];
            arr[i][a] = arr[i][b];
            arr[i][b] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] >= 0 ? " " : "");
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
