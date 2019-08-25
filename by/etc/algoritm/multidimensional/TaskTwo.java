package by.etc.algoritm.multidimensional;

/*Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали*/

public class TaskTwo {

    public static void main(String[] args) {
        task(10, 10);
    }

    private static void task(int m, int n) {
        int arr[][] = new int[m][n];

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
        System.out.print("\nДиагональ: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][i] + "\t");
        }

    }
}
