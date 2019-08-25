package by.etc.basic.linear;

/* Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
дробную и целую части числа и вывести полученное значение числа.*/

public class TaskFour {

    public static void main(String[] args) {

        task(123.456);
    }

    private static void task(double r) {

        double result;

        result = (int) r / 1000.0 + (r - (int) r) * 1000;
        System.out.format("%.3f", result);
    }
}
