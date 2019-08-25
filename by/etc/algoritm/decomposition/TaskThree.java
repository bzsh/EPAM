package by.etc.algoritm.decomposition;

 /*Вычислить площадь правильного шестиугольника со стороной а,
  используя метод вычисления площади треугольника.*/

public class TaskThree {
    public static void main(String[] args) {

        System.out.println(hexagonArea(9));
        System.out.println(triangleArea(9));
    }

    private static double triangleArea(int a) {
        return (Math.pow(a, 2) * Math.sqrt(3)) / 4;
    }

    private static double hexagonArea(int a) {
        return 6 * triangleArea(a);
    }

}
