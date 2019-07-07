package by.etc.algoritm.multidimensional;

public class TaskFour {
    public static void main(String[] args) {
        task(10,10);
    }

    private static void task(int m, int n) {
        int arr[][] = new int[m][n];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                count = 1;
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = count;
                    count++;
                }
            } else {
                for (int j = 0; j < arr[i].length; j++) {
                    count--;
                    arr[i][j] = count;
                }
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
