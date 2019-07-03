package by.etc.basic.linear;

public class TaskSix {

    public static void main(String[] args) {
        new TaskSix().task(2, 2);
    }

    private void task(int x, int y) {

        boolean result;
        result = (x >= -2) && (x <= 2) && (y >= 0) && (y <= 4) || (x >= -4) && (x <= 4) && (y >= -3) && (y <= 0);

        if (x == 0 && y == -1) {
            System.out.println(false);
        } else {
            System.out.println(result);
        }
    }
}