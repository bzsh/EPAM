package by.etc.algoritmisation.multidimensional;

public class TaskFive {
    public static void main(String[] args) {
        task(10, 10);
    }

    private static void task(int m, int n) {
        int arr[][] = new int[m][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length - i; j++) {
                arr[i][j] = i + 1;
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

