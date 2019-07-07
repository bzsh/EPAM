package by.etc.algoritm.multidimensional;

public class TaskTwelve {
    public static void main(String[] args) {
        task(10, 10);
    }

    private static void task(int n, int m) {
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
                for (int j = r; j < arr[i].length; j++) {
                    if (arr[i][r] > arr[i][j]) {
                        temp = arr[i][r];
                        arr[i][r] = arr[i][j];
                        arr[i][j] = temp;
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
                for (int j = r; j < arr[i].length; j++) {
                    if (arr[i][r] < arr[i][j]) {
                        temp = arr[i][r];
                        arr[i][r] = arr[i][j];
                        arr[i][j] = temp;
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
