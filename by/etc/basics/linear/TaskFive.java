package by.etc.basics.linear;

public class TaskFive {

    public static void main(String[] args) {
        task(3723);
    }

    private static void task(int t) {

        System.out.println(t / 3600 + "ч " + (t % 3600) / 60 + "м " + (t % 3600) % 60 + "с");
    }
}