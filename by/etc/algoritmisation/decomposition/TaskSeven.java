package by.etc.algoritmisation.decomposition;

/*
Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
*/

public class TaskSeven {
    public static void main(String[] args) {
        task();
    }

    private static void task() {
        int sum = 0;

        for (int i = 1; i < 10; i += 2) {
            sum += getFactorial(i);
        }

        System.out.println(sum);
    }

    private static int getFactorial(int num) {
        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }


}
