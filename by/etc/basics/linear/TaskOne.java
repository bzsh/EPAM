package by.etc.basics.linear;

public class TaskOne {

    public static void main(String[] args) {

        System.out.println(task(1, 2, 3));
    }

    private static double task(int a, int b, int c) {

        int z;

        z = ((a - 3) * b / 2) + c;

        return z;
    }
}
