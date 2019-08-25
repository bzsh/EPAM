package by.etc.algoritm.multidimensional;

/* Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.*/

public class TaskThirteen {

    public static void main(String[] args) {
        task(10);
    }

    private static void task(int n) {
        int arr[][] = new int[n][n];
        int temp;

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
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            for (int r = 0; r < arr.length; r++) {
                for (int j = r; j < arr.length; j++) {
                    if (arr[r][i] > arr[j][i]) {
                        temp = arr[r][i];
                        arr[r][i] = arr[j][i];
                        arr[j][i] = temp;
                    }
                }
            }
        }
        System.out.println("Отсортирован по возростанию : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            for (int r = 0; r < arr.length; r++) {
                for (int j = r; j < arr.length; j++) {
                    if (arr[r][i] < arr[j][i]) {
                        temp = arr[r][i];
                        arr[r][i] = arr[j][i];
                        arr[j][i] = temp;
                    }
                }
            }
        }

        System.out.println("Отсортирован по убыванию : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}
