package by.etc.algoritm.array;

/*Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.*/

public class TaskTen {
    public static void main(String[] args) {
        task(30);
    }

    private static void task(int n) {
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((Math.random() * 200) - 100);
            System.out.print(arr[i] + "\t");
        }

        System.out.println();

        for (int i = 1; i < arr.length; i += 2) {
            arr[i] = 0;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
