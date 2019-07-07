package by.etc.algoritm.sorting;

/*Даны дроби. Составить программу, которая
 приводит эти дроби к общему знаменателю
 и упрядочивает их в порядке возрастания
*/

public class TaskEight {

    public static void main(String[] args) {
        task(5);
    }

    private static void task(int n) {

        int[] numerator = new int[n];
        int[] denominator = new int[n];
        int nok;

        for (int i = 0; i < n; i++) {                       // создание дробей
            numerator[i] = (int) (Math.random() * 11 + 1);
            denominator[i] = (int) (Math.random() * 21 + 2);
        }

        System.out.println();
        for (int i = 0; i < n; i++) {                       // печать дробей
            System.out.print(numerator[i] + "/" + denominator[i] + "     ");
        }
        System.out.println();

        nok = nok(denominator[0], denominator[1]); // НОК 2х чисел

        if (denominator.length > 2) {

            for (int i = 2; i < denominator.length; i++) {  // НОК нескольких чисел
                nok = nok(nok, denominator[i]);
            }
        }

        for (int i = 0; i < denominator.length; i++) {          // формеруем новые дроби с общим знаменателем
            numerator[i] = numerator[i] * (nok / denominator[i]);
            denominator[i] = nok;
        }

        sort(numerator);  // сортируем новые дроби

        System.out.println("Дроби с общим знаменателем : ");
        for (int i = 0; i < n; i++) {                       // печать новых дробей
            System.out.print(numerator[i] + "/" + denominator[i] + "     ");
        }
        System.out.println();
    }

    private static int nok(int a, int b) {  // метод для нахождения НОК 2х чисел НОК(a,b)
        return (a * b) / getNod(a, b);
    }

    private static int getNod(int a, int b) {  // метод для нахождения  НОД 2х чисел при помощи алгоритма Евклида НОК(a,b)

        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    private static void sort(int[] numerator) {              // метод для сортировки дробей по возростанию (в новых дробях достаточно сортировать числители)

        for (int i = numerator.length - 1; i > 0; i--) {     // сортировка обменом
            for (int j = 0; j < i; j++) {
                if (numerator[j] > numerator[j + 1]) {
                    int temp = numerator[j];
                    numerator[j] = numerator[j + 1];
                    numerator[j + 1] = temp;
                }
            }
        }
    }
}


