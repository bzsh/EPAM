package by.etc.basics.loops;

import java.util.HashSet;
import java.util.Set;

public class TaskEight {

    public static void main(String[] args) {

        task(1234124, 12412412);
    }

    private static void task(int a, int b) {

        String one = String.valueOf(a);
        String two = String.valueOf(b);
        char[] arr = one.toCharArray();
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {

            if (two.contains(String.valueOf(arr[i]))) {

                set.add(arr[i]);
            }
        }

        for (Character ch : set) {

            System.out.print(ch + " ");
        }
    }
}
