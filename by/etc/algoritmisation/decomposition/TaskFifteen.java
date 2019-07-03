package by.etc.algoritmisation.decomposition;

/*Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
        последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.*/

public class TaskFifteen {

    public static void main(String[] args) {

        task(2);
    }

    private static void task(int n) {

        getSequence(n);
    }

    public static void getSequence(int n) {
        int count = 1;
        if (n > 1) {

            for (int i = 1; i <= 10 - n; i++) {

                count ++;

                printNextDigit(count, i, n);

            }

        } else {
            System.out.println("Для создания последовательности аргумент должен быть n >= 2 ! ");
        }
    }

    private static void printNextDigit(int count, int i, int n) {
        int cnt = 1;

        if (count < 10 ) {
            System.out.print(count);
            printNextDigit(count + 1, i, n);

        }
    }
}

