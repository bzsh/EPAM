package by.etc.algoritm.array;

/*Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
положительных и нулевых элементов.*/

public class TaskThree {
    public static void main(String[] args) {
        task(200);
    }

    private static void task(int n) {

        int[] arr = new int[n];
        int posCount = 0;
        int negCount = 0;
        int zeroCount = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((Math.random() * 200) - 100);
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeroCount++;
            } else if (arr[i] > 0) {
                posCount++;
            } else {
                negCount++;
            }
        }
        System.out.println("Положительных: " + posCount + "\nОтрицательных : " + negCount + "\nНулевых: " + zeroCount);

    }
}
