package by.etc.algoritmisation.multidimensional;

public class TaskOne {
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
        System.out.println();
        for (int j = 0; j < arr[0].length; j += 2) {
            if (arr[0][j] > arr[arr.length - 1][j]) {
                System.out.print(j+1 + ") ");
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }
}

