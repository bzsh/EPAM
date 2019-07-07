package by.etc.algoritm.multidimensional;

public class TaskSeven {

    public static void main(String[] args) {
        task(10);
    }

    private static void task(int n) {
        double arr[][] = new double[n][n];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length - i; j++) {
                arr[i][j] = Math.sin((Math.pow(i,2) - Math.pow(j,2)) / n);
                if(arr[i][j] > 0){
                    count++;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] >= 0 ? " ": "");
                System.out.format("%.1f",arr[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
        System.out.println("\n" + "Положительных элементов: " + count + ".");
    }
}
