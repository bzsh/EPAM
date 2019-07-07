package by.etc.algoritm.decomposition;

/* На плоскости заданы своими координатами n точек.
   Написать метод(методы), определяющие, между какими
   из пар точек самое большое расстояние. Указание.
   Координаты точек занести в массив.*/

public class TaskFour {

    public static void main(String[] args) {

        task(7);
    }

    private static void task(int n) {
        double[] arrOfDistance = new double[n];
        int[][] points;
        int index;

        points = getArrOfRandomPoints(n);

        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                arrOfDistance[i] = getDistance(points[0][i], points[1][i], points[0][j], points[1][j]);
            }
        }

        index = getMaxDistanceIndex(arrOfDistance);
        System.out.print("Максимальное расстояние между " +
                "точками с координатами  "
                + points[0][index] + " : " + points[1][index]
                + " и " + points[0][index + 1] + " : " + points[1][index + 1]);

    }

    private static double getDistance(int x1, int y1, int x2, int y2) {     // метод рассчитывает расстояние между 2-мя точками на плоскости
        return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
    }

    private static int[][] getArrOfRandomPoints(int n) { // метод создает массив со случайными координатами точек
        int[][] arr = new int[n][n];
        int x;
        int y;

        for (int i = 0; i < arr.length; i++) {
            x = (int) (Math.random() * 100);
            y = (int) (Math.random() * 100);
            arr[0][i] = x;
            arr[1][i] = y;
        }
        return arr;
    }

    private static int getMaxDistanceIndex(double[] distance) { // метод возвращает индекс элемента с максимальным значением
        double max = 0.0;
        int index = -1;

        for (int i = 0; i < distance.length; i++) {
            if (distance[i] > max) {
                max = distance[i];
                index = i;
            }
        }
        return index;
    }
}
