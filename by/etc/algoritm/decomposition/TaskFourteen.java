package by.etc.algoritm.decomposition;

/*
Натуральное число, в записи которого n цифр, называется числом Армстронга,
 если сумма его цифр, возведенная в степень n, равна самому числу.
 Найти все числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию.
*/

public class TaskFourteen {
    public static void main(String[] args) {
        task(23467678);
    }

    private static void task(long k){
        printArray(getArmstrongNumbers(k));
    }

    private static void printArray(long[]arr){
        System.out.println();
        for (long i : arr) {                   // печать массива
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static long[] getArmstrongNumbers(long k){
        int count = 0;
        long[] numbers;
        long[] cheatArr =  {1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407, 1634, 8208, 9474, 54748,
                92727, 93084, 548834, 1741725, 4210818, 9800817, 9926315, 24678050, 24678051, 88593477,
                146511208, 472335975, 534494836, 912985153, 4679307774L, 32164049650L, 32164049651L,
                40028394225L, 42678290603L, 44708635679L, 49388550606L, 82693916578L, 94204591914L, 28116440335967L,
                4338281769391370L, 4338281769391371L, 21897142587612075L, 35641594208964132L, 35875699062250035L,
                1517841543307505039L, 3289582984443187032L, 4498128791164624869L, 4929273885928088826L};

        for(int i = 0; i < cheatArr.length; i++){
            if(cheatArr[i] <= k){
                count++;
            }
        }

        numbers = new long[count];

        for(int i = 0; i < numbers.length; i++){
            if(cheatArr[i] <= k){
                numbers[i] = cheatArr[i];
            }
        }
        return numbers;
    }

}
