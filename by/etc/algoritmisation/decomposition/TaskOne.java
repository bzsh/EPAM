package by.etc.algoritmisation.decomposition;

/*
 Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
*/

public class TaskOne {

    public static void main(String[] args) {
        System.out.println(nod(3, 5));
        System.out.println(nok(3, 5));
    }

    private static int nok(int a, int b) {  // метод для нахождения НОК 2х чисел НОК(a,b)

        return a * b / nod(a, b);
    }

    private static int nod(int a, int b) {  // метод для нахождения  НОД 2х чисел при помощи алгоритма Евклида НОК(a,b)

        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
}
