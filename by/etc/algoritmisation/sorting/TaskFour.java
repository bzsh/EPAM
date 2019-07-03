/*
Сортировка обменами
*/

package by.etc.algoritmisation.sorting;


public class TaskFour {
    public static void main(String[] args) {
        task(30);
    }

    private static void task(int n){
        int[] arr = new int[n];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);    // заполнение массива
        }

        System.out.println();
        for (int i : arr) {                   // печать массива
            System.out.print(i + " ");
        }

        for (int i = arr.length - 1; i > 0; i--) { // сортировка обменом
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    count++;
                }
            }
        }

        System.out.println("\nОтсортированный массив : ");
        for (int i : arr) {                   // печать массива
            System.out.print(i + " ");
        }
        System.out.println(" Число обменов = " + count);
    }
}
