package by.etc.algoritmisation.sorting;


import java.io.IOException;

/*
Сортировка Шелла.
 Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
 Делается это следующим образом: сравниваются два соседних элемента
 ai и ai+1. Если ai <= ai+1, то продвигаются на один элемент вперед.
 Если ai < ai+1, то производится перестановка и сдвигаются на один элемент назад.
 Составить алгоритм этой сортировки.
*/

public class TaskSix {

    public static void main(String[] args) throws IOException {
        task(20);
    }

    private static void task(int n){
        int[] arr = new int[n];
        int d = arr.length / 2;

        for (int i = 0; i < arr.length; i++) {   // заполнение массива
            arr[i] = (int) (Math.random() * 100);
        }

        System.out.println();

        for (int i : arr) {                      // печать массива
            System.out.print(i + "\t");
        }

        while (d > 0) { // сортировка Шелла

            for (int i = 1; i < arr.length - d; i++) { // перебор с интервалом в d
                int j = i;

                while (j > 0 && arr[j] > arr[j + d]) {  // перестановка со сдвигом
                    int temp = arr[j];
                    arr[j] = arr[j + d];
                    arr[j + d] = temp;
                    j--;
                }
            }
            d = d / 2; // делим d еще на 2
        }

        System.out.println();

        for (int i : arr) {                      // печать отсортированного массива
            System.out.print(i + "\t");
        }

    }
}
