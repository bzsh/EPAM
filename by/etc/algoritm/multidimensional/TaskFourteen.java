package by.etc.algoritm.multidimensional;

public class TaskFourteen {

    public static void main(String[] args) {
        task();
    }

    private static void task() {
        int n = (int) ((Math.random() * (10 - 3 + 1) + 3));
        int m = (int) ((Math.random() * (10 - n + 1) + n)); // корректрировка числа столбцов от числа строк по правилу : (кол-во строк >= кол-ву столбцов )
        System.out.println("Создана матрица " + m + " на " + n);
        int arr[][] = new int[m][n];
        int count;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        for (int j = 0; j < arr[0].length; j++) {
            count = j + 1;
            for (int i = 0; i < arr.length; i++) {
                if (count > 0) {
                    arr[i][j] = 1;
                    count--;
                }
            }
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
