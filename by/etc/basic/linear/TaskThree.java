package by.etc.basic.linear;

public class TaskThree {

    public static void main(String[] args) {

        System.out.println(task(3, 5));
    }

    private static double task(double x, double y) {

        double result;

        result = ((Math.sin(x) + Math.cos(y)) / ((Math.cos(x) - Math.sin(y)))) * Math.tan(x * y);

        return result;
    }
}
