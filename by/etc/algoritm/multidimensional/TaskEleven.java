package by.etc.algoritm.multidimensional;

public class TaskEleven {
    public static void main(String[] args) {
        task(10, 20);
    }

    private static void task(int m, int n) {
        int arr[][] = new int[m][n];
        int count = 0;
        int index = 0;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) ((Math.random() * 16));
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");

            }
            System.out.println();
        }
        System.out.print("В данном массиве");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 5) {
                    count++;
                }
            }
            if (count >= 3) {
                found = true;
                index = i + 1;
                System.out.print("\n строка номер: " + index + " имеет " + count + " элемнта равных 5");
                count = 0;
            }else { count = 0;}
        }
        System.out.print(found ? "." : " строк содержащих цифру 5 три и болле раз не найдено.");
    }
}
