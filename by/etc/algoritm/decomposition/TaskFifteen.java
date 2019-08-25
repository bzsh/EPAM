package by.etc.algoritm.decomposition;


/*Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.*/

public class TaskFifteen {

    private static int[] arr;

    public static void main(String[] args) {
        getNumbers(5);
    }

    private static void getNumbers(int n) {
        arr = new int[n];
        genNum(0);
    }

    private static void genNum(int cnt) {
        if (cnt == arr.length) {
            printArr();
            return;
        }

        if (cnt == 0) {
            for (int i = 1; i <= 9; i++) {
                arr[cnt] = i;
                genNum(cnt + 1);
            }

        } else {
            for (int i = arr[cnt - 1] + 1; i <= 9; i++) {
                arr[cnt] = i;
                genNum(cnt + 1);
            }
        }
    }

    private static void printArr() {
        for (int i : arr) {
            System.out.print(i);
        }
        System.out.println();
    }
}