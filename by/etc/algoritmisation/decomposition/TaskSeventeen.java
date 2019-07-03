package by.etc.algoritmisation.decomposition;

/* Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.*/

public class TaskSeventeen {

    public static void main(String[] args) {
        task(12345);
    }

    private static void task(int n){
        System.out.println("Количество операций : " + getCount(n));
    }

    private static int getSum(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    private static int getCount(int n){
        int count = 0;
        while(n != 0){
            n -= getSum(n);
            count++;
        }
        return count;
    }
}
