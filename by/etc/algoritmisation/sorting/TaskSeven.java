package by.etc.algoritmisation.sorting;

 /*Пусть даны две неубывающие последовательности
  действительных чисел a1 <= a2 <=...<= an и
   b1 <= b2 <=...<= bm. Требуется указать те места,
 на которые нужно вставлять элементы последовательности
  b1 <= b2 <=...<= bm в первую последовательность так,
  чтобы новая последовательность оставалась возрастающей.
  */


public class TaskSeven {

    public static void main(String[] args) {
        task(20, 15);
    }

    private static void task(int n, int m) {
        int[] arrOne = new int[n];
        int[] arrTwo = new int[m];

        for (int i = 0; i < arrOne.length; i++) {
            arrOne[i] = (int) (Math.random() * 100);    // заполнение массива arrOne
        }

        for (int i = 0; i < arrTwo.length; i++) {
            arrTwo[i] = (int) (Math.random() * 100);    // заполнение массива arrTwo
        }

        sort(arrOne);       // сортируем массив arrOne
        sort(arrTwo);       // сортируем массив arrTwo

        for (int i = 0; i < arrOne.length; i++) { // индексы 1го массива
            System.out.print(i + "\t");
        }

        System.out.println("\nмассив 1");
        for (int i : arrOne) {                   // печать массива
            System.out.print(i + "\t");
        }

        System.out.println("\nмассив 2");
        for (int i : arrTwo) {                   // печать массива
            System.out.print(i + "\t");
        }

        System.out.println();

        for (int i = 1; i < arrOne.length; i++) {
            for (int j = 0; j < arrTwo.length; j++) {
                if (arrOne[i] >= arrTwo[j] && arrTwo[j] >= arrOne[i - 1]) {
                    System.out.println(" число " + arrTwo[j] + " 2го массива нужно вставить в первый массив между индексами " + i + " и " + (i - 1));
                    if (i != arrOne.length - 1) {
                        i++;
                    }
                } else if (arrOne[i - 1] > arrTwo[j] && i == 1) {
                    System.out.println("число " + arrTwo[j] + " надо вставить в первый массив перед индексом 0 ");
                }else if(arrOne[i] < arrTwo[j] && i == arrOne.length - 1){
                    System.out.println("число " + arrTwo[j] + " надо вставить после индекса " + i + " первого массива");
                }
            }
        }
    }

    private static void sort(int[] arr) {

        for (int i = arr.length - 1; i > 0; i--) { // сортировка обменом
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
