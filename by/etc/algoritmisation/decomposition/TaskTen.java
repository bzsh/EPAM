package by.etc.algoritmisation.decomposition;

/*Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого
        являются цифры числа N*/

public class TaskTen {
    public static void main(String[] args) {
        task(1234567);
    }
    private static void task(int n){
        int[] arr;


        arr = getDigits(n);

        System.out.println(n);

        printArray(arr);

    }

    private static int[] getDigits(int number){
        int[]digits;
        int count = 0;
        int temp = number;

        while(temp != 0){
            count++;
            temp /= 10;
        }

        digits = new int[count];

        for(int i = digits.length - 1; i >= 0; i--){
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    private static void printArray(int[]arr){
        System.out.println();
        for (int i : arr) {                   // печать массива
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
