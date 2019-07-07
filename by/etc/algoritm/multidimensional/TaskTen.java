package by.etc.algoritm.multidimensional;

public class TaskTen {

    public static void main(String[] args) {
        task(10);
    }

    private static void task(int n) {
        int arr[][] = new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) ((Math.random() * 200) - 100);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] >= 0 ? " " : "");
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nПоложительные элементы главной диагонали: ");
        for (int i = 0; i < arr.length; i++) {
                if (arr[i][i] > 0){
                    System.out.print(arr[i][i] + "\t");
                }

        }
    }
}
