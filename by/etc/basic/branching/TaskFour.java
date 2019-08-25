package by.etc.basic.branching;

/* Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
отверстие.
*/

public class TaskFour {

    public static void main(String[] args) {

        task(40, 47, 54, 79, 41);
    }

    private static void task(int a, int b, int c, int d, int e) {

        int s1 = a * b;
        int s2 = c * a;
        int s3 = b * c;
        int s4 = d * e;

        if (s1 <= s4 || s2 <= s4 || s3 <= s4) {
            System.out.println("Кирпич пройдет");
        } else {
            System.out.println("Кирпич не пройдет");
        }
    }
}
