package by.etc.basic.linear;

/* Вычислить значение выражения по формуле (все переменные принимают действительные значения):*/

public class TaskTwo {

    public static void main(String[] args) {

        System.out.println(task(-1, 4, 3));
    }

    private static double task(int a, int b, int c) {

        double result;
        double r = Math.sqrt(b * b + 4 * a * c);

        result = (b + r) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);

        return result;
    }
}
