package by.etc.algoritm.sorting;

public class TaskTwo {
    public static void main(String[] args) {
        task();
    }

    private static void task() {
        int[] arrOne = new int[(int) ((Math.random() * (10 - 3 + 1) + 3))];
        int[] arrTwo = new int[(int) ((Math.random() * (10 - 3 + 1) + 3))];
        int[] result = new int[arrOne.length + arrTwo.length];
        int iterator = 0;

        for (int i = 0; i < arrOne.length; i++) {
            int rnd = (int) (Math.random() * 100); // заполняем 1й массив
            if (i == 0 || rnd >= arrOne[i - 1]) {
                arrOne[i] = rnd;
            } else {
                i--;
            }
        }

        for (int i = 0; i < arrTwo.length; i++) {
            int rnd = (int) (Math.random() * 100); // заполняем 2й массив
            if (i == 0 || rnd >= arrTwo[i - 1]) {
                arrTwo[i] = rnd;
            } else {
                i--;
            }
        }

        for (int i = 0; i < arrOne.length; i++) {
            result[iterator] = arrOne[i];
            iterator++;
        }

        for (int i = 0; i < arrTwo.length; i++) {
            result[iterator] = arrTwo[i];
            iterator++;
        }

        for (int i = result.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (result[j] > result[j + 1]) {
                    int temp = result[j];
                    result[j] = result[j + 1];
                    result[j + 1] = temp;
                }
            }
        }


        System.out.println();
        for (int i : arrOne) {
            System.out.print(i + " ");
        }

        System.out.println();
        for (int i : arrTwo) {
            System.out.print(i + " ");
        }

        System.out.println();
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
