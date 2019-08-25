package by.etc.algoritm.decomposition;

/*Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
        Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для
        решения задачи использовать декомпозицию.*/

public class TaskThirteen {
    public static void main(String[] args) {
        task(40);
    }

    private static void task(int n) {
        printTwins(getArrOfPrimes(n));
    }

    private static int[] getArrOfPrimes(int n) {
        int[] primes;
        int count = 0;
        int dev = 0;

        primes = new int[(2 * n - n + 1) / 2];

        for (int i = n; i <= 2 * n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    dev++;
                }
            }
            if (dev <= 2) {
                primes[count] = i;
                count++;
            }
            dev = 0;
        }
        return primes;
    }

    private static void printTwins(int[] primes) {
        System.out.println("Пары из заданного промежутка : ");
        for (int i = 1; i < primes.length; i++) {
            if (primes[i] != 0 && primes[i] == primes[i - 1] + 2) {
                System.out.print(primes[i - 1] + " и " + primes[i] + " ; ");
            }
        }
    }
}
