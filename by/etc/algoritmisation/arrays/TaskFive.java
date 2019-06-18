package by.etc.algoritmisation.arrays;

public class TaskFive {
    public static void main(String[] args) {
        task(50);
    }

    private static void task(int n) {
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((Math.random() * 200) - 100);
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > i) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
