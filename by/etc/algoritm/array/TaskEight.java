package by.etc.algoritm.array;

/*Дана последовательность целых чисел
. Образовать новую последовательность, выбросив из
исходной те члены, которые равны
min( , , , ) a1 a2  an
.*/

public class TaskEight {
    public static void main(String[] args) {
        task(20);
    }


    private static void task(int n) {
        int arr[] = new int[n];
        int arr2[] = new int[n];
        int min = 111;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((Math.random() * 200) - 100);
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min) {
                arr2[i] = arr[i];
                System.out.print(arr2[i] + " ");
            }
        }
    }
}
