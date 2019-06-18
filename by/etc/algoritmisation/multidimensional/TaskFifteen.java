package by.etc.algoritmisation.multidimensional;

public class TaskFifteen {
    public static void main(String[] args) {
        task(10);
    }

    private static void task(int n) {
        int arr[][] = new int[n][n];
        int rnd;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) { // наполнение массива числами от 0 - 99, с записью максимального значения в max.
                rnd = (int) ((Math.random() * 100));
                arr[i][j] = rnd;
                if (rnd > max){
                    max = rnd;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("----------Максимальное значение в массиве = " + max  + ".");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] % 2 == 0){
                    arr[i][j] = max;
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
