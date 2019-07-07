package by.etc.algoritm.decomposition;

/*Даны натуральные числа К и N. Написать метод(методы)
 формирования массива А, элементами которого
 являются числа, сумма цифр которых равна К и которые не большее N*/

public class TaskTwelve {
    public static void main(String[] args) {
        task(4, 50);
    }

    private static void task(int k, int n) {
        printArr(getArr(k, n));
    }

    private static int[] getArr(int k, int n) { // метод создает массив согласно условию задачи
        int[] arr;
        int num = 0;

        arr = new int[getNumOfElements(k, n)];

        for (int i = 0; i <= n; i++) {
            int temp = i;
            int sum = 0;
            while (temp != 0) {
                sum += temp % 10;
                temp /= 10;
            }
            if (sum == k) {
                arr[num++] = i;
            }
        }
        return arr;
    }

    private static void printArr(int[] arr) {
        System.out.println();
        for (int i : arr) {                   // печать массива
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static int getNumOfElements(int k, int n) { // метод возвращает число (количество возможных комбинаций чисел), которое можно использовать для создани массива
        int count = 0;
        for (int i = 0; i <= n; i++) {
            int temp = i;
            int sum = 0;
            while (temp != 0) {
                sum += temp % 10;
                temp /= 10;
            }
            if (sum == k) {
                count++;
            }
        }
        return count;
    }

}
