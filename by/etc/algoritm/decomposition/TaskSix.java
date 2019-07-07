package by.etc.algoritm.decomposition;

/*
Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
*/

public class TaskSix {
    public static void main(String[] args) {
        task(15, 34, 27);
    }

    private static void task(int a, int b, int c){
        if(getNod(getNod(a, b), c) == 1){
            System.out.println("Числа взаимно простые.");
        } else {
            System.out.println("Числа взаимно не простые.");
        }
    }

    private static int getNod(int a, int b) {  // метод для нахождения  НОД 2х чисел при помощи алгоритма Евклида НОК(a,b)

        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
}
