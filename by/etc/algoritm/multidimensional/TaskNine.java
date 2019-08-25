package by.etc.algoritm.multidimensional;

/*Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
столбец содержит максимальную сумму.*/

public class TaskNine {

    public static void main(String[] args) {
        task(10);
    }

    private static void task(int n) {
        int index = 0;
        int temp = 0;
        int max = 0;

        int arr[][] = new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) ((Math.random() * 100));
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length; i++) {
                temp += arr[i][j];
            }
            if (temp > max) {
                max = temp;
                temp = 0;
                index = j;
            }
        }
        System.out.println("\nМаксимальная сумма элементов в " + (index + 1) + " столбце.");
    }
}
