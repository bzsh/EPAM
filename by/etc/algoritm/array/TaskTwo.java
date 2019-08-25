package by.etc.algoritm.array;

/*Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
числом. Подсчитать количество замен.*/

public class TaskTwo {
    public static void main(String[] args) {
        task(20, 21);
    }

    private static void task(int n, int z) {

        int[] arr = new int[n];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > z) {
                arr[i] = z;
                count++;
            }
        }
        System.out.println(count + " замен");
    }
}
