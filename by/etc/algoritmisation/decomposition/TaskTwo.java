package by.etc.algoritmisation.decomposition;

/*
Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
*/

public class TaskTwo {

    public static void main(String[] args) {
        System.out.println(nodOfFourNums(64, 32, 16, 8));
    }

    private static int nodOfFourNums (int a, int b, int c, int d) { // метод для нахождения НОД 4х чисел
        return nod(nod(nod(a,b), c), d);
    }

    private static int nod(int a, int b) {  // метод для нахождения НОД 2х чисел при помощи алгоритма Евклида НОК(a,b)

        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
}
