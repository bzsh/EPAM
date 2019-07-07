package by.etc.algoritm.decomposition;

/*Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
        последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.*/

public class TaskFifteen {

    /*public static void main(String[] args) {

        task(2);
    }*/

    private static void task(int n) {

        getSequence(n);
    }

    public static void getSequence(int n) {

    }

    private static void printNextDigit(int count, int i, int n) {

        if (count < 10) {
            System.out.print(count + 1);
            //printNextDigit(count + 1, i, n);
        }
    }
}

    /*int count = 1;
        if (n > 1) {
                for (int i = 1; i <= 10 - n; i++) {
                while (count < n) {
        printNextDigit(count, i, n);
        count++;
        }
        }

        } else {
        System.out.println("Для создания последовательности аргумент должен быть n >= 2 ! ");
        }*/