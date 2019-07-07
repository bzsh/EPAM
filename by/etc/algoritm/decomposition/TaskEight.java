package by.etc.algoritm.decomposition;

/*Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
        Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
        массива с номерами от k до m.*/

public class TaskEight {
    public static void main(String[] args) {
        task(9);
    }

    private static void task(int n){
        int[]arr;

        arr = getRandomArray(n);
        printArray(arr);

        System.out.println(getSum(arr,1,3));
        System.out.println(getSum(arr,3,5));
        System.out.println(getSum(arr,4,6));

    }

    public static int getSum(int[] a, int start, int end) {
        int sum = 0;

        for (int i = start; i <= end; i++) {
            sum += a[i];
        }
        return sum;
    }

    private static int[] getRandomArray(int n) {      // метод создает массив со случайными числами
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    private static void printArray(int[]arr){
        System.out.println();
        for (int i : arr) {                   // печать массива
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
