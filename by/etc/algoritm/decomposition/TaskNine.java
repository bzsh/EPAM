package by.etc.algoritm.decomposition;

 /*Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
         если угол между сторонами длиной X и Y— прямой.*/

public class TaskNine {
    public static void main(String[] args) {
        task();
    }

    private static void task() {

        System.out.println(getSquare(5, 4, 3, 6));
    }

    public static double getSquare(int a, int b, int c, int d) {
        double p = (a + b + c + d) / 2.0;

        return Math.sqrt((p - a) * (p - b) * (p - c) * (p - d));
    }
}
