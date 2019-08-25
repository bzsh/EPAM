package by.etc.basic.branching;

/* Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
он прямоугольным.*/

public class TaskOne {

    public static void main(String[] args) {

        task(80, 55);
    }

    private static void task(int a, int b) {

        if (a + b >= 180) {
            System.out.println("Треугольник не существует");
        } else if (a == 90 || b == 90 || a + b == 90) {
            System.out.println("Это прямоугольный треугольник");
        } else {
            System.out.println("Это треугольник");
        }
    }
}
