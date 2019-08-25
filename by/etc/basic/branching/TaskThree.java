package by.etc.basic.branching;

/* Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой. */

public class TaskThree {

    public static void main(String[] args) {

        task(1, 3, 1, 4, 1, 6);
    }

    private static void task(int x1, int y1, int x2, int y2, int x3, int y3) {

        String res;
        boolean result;

        result = (x1 - x3) * (y2 - y3) == (x2 - x3) * (y1 - y3);
        res = result ? "Точки расположены на одной прямой" : "Точки расположены не на одной прямой";

        System.out.println(res);
    }
}
