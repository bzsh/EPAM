package by.etc.algoritmisation.arrays;

public class TaskNine {

    public static void main(String[] args) {
        task(30);
    }

    private static void task(int n) {
        int[] arr = new int[n];
        int[] same = new int[n];
        int[] counter = new int[n];
        int temp = 1;
        int minValue = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((Math.random() * 200) - 100); // заполнение массива и вывод содержимого на консоль
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) { // поиск повторений (суммирование повторяющихся значений в новый массив )
                if (arr[i] == arr[j]) {
                    same[i] += arr[i];
                }
            }
        }

        for (int i = 0; i < arr.length; i++) { // узнаем число повторений путем деления значения
            if (arr[i] != 0) {
                counter[i] = same[i] / arr[i]; // из same на значение из arr по общему индексу и записываем в массив с повторениями
            }else {
                counter[i] = 0;
            }
        }

        for (int i = 0; i < counter.length; i++) {
            if (temp < counter[i]) { // поиск максимального числа повторений
                temp = counter[i];
            }
        }

        for (int i = 0; i < counter.length; i++) {
            if (counter[i] == temp) {
                if (minValue > arr[i]) { // поиск минимального значения из всех максимально повторихшихся чисел
                    minValue = arr[i];   //
                }
            }
        }
        System.out.println("\nЧисло " + minValue + " повторялось, число повторений " + temp);
    }
}
