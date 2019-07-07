package by.etc.algoritm.array;

public class TaskSix {
    public static void main(String[] args) {
        task(10);
    }

    private static void task(int n) {

        double[] arr = new double[n];
        double sum = 0;
        int dev = 0;


        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((Math.random() * 200) - 100);
        }
        System.out.println();

        for (int i = 2; i < arr.length; i++) { // i = 2 т.к. первое простое число 2
            for (int j = 1; j <= i; j++) { // делим число на все числа от единицы до самого числа
                if (i % j == 0) {   // если делится без остатка, то в счетчик делителей плюсуем единицу
                    dev++;
                }
            }
            if (dev <= 2) { // если кол-во делителей не более 2х ( на 1 и на само себя), то это простое число.
                sum += arr[i]; // суммирую значения чей индекс в массиве явл простым числом
            }
            dev = 0; // сброс счетчика
        }
        System.out.println(sum);
    }

}
