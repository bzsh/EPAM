package by.etc.algoritm.decomposition;

/*Составить программу, которая в массиве A[N] находит 
 второе по величине число (вывести на печать число,
 которое меньше максимального элемента массива, 
 но больше всех других элементов).*/


public class TaskFive {
    public static void main(String[] args) {
        task(10);
    }

    private static void task(int n) {
        int[] arr;
        int number;
        boolean flag = true;
        int i = 1;

        arr = getRandomArray(n);
        printArray(arr);
        sort(arr);

        while (flag || i == arr.length) {
            if (arr[i - 1] > arr[i]) {
                number = arr[i];
                System.out.println(" число меньше максимального элемента массива, \n" +
                        " и больше всех других элементов " + number);
                flag = false;
            }
            i++;
        }

    }

    private static void printArray(int[] arr) {
        System.out.println();
        for (int i : arr) {                   // печать массива
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static int[] getRandomArray(int n) {      // метод создает массив со случайными числами
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    private static void sort(int[] arr) {              // метод для сортировки одномерного массива

        for (int i = arr.length - 1; i > 0; i--) {     // сортировка обменом
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
