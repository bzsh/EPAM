package by.etc.algoritm.multidimensional;

/*Дана матрица. Вывести k-ю строку и p-й столбец матрицы.*/

public class TaskThree {
    public static void main(String[] args) {
        task(2, 4);
    }

    private static void task(int k, int p) {
        int arr[][] = new int[10][10];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) ((Math.random() * 200) - 100);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        if (k < arr.length && p < arr.length) {
            System.out.println();
            System.out.print("Строка: ");

            for (int j = 0; j < arr[k].length; j++) {
                System.out.print(arr[k][j] + "\t");
            }

            System.out.print("\nСтолбец: ");
            for (int i = 0; i < arr[k].length; i++) {
                System.out.print(arr[i][p] + "\t");
            }
        }
    }
}
