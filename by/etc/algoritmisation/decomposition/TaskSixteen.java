package by.etc.algoritmisation.decomposition;

/* Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.*/

public class TaskSixteen {

    public static void main(String[] args) {
        task(4);
    }

    private static void task( int n){
        int sum;
        int count;

        sum = getSum(n);
        count = getEvens(sum);

        System.out.println("Сумма всех " + n + " значных чисел : " + sum);
        System.out.println("Количество четных цифр в найденной суммее : " + count + ".");
    }

    private static int getSum(int n) {
        int start = (int) Math.pow(10, n - 1);
        int end = (int)Math.pow(10, n);
        int sum = 0;

        for (int i = start; i < end; i++) {
            int temp = i;
            boolean print = true;
            while (temp != 0) {
                if ((temp % 10) % 2 == 0) {
                    print = false;
                    break;
                }
                temp /= 10;
            }
            if (print) {
                //System.out.println(i);
                sum += i;
            }
        }
        return sum;
    }

    private static int getEvens(int sum) { // метод возвращает количество четных цифр в числе
        int count = 0;
        while (sum != 0) {
            if ((sum % 10) % 2 == 0) {
                count++;
            }
            sum /= 10;
        }
        return count;
    }
}
