package by.etc.algoritm.multidimensional;

public class TaskSix {

    public static void main(String[] args) {
        task(10);
    }

    private static void task(int n) {
        int arr[][] = new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[i].length - i; j++) {
                arr[i][j] = 1;
                arr[arr.length - i - 1][arr.length - j - 1] = 1;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
