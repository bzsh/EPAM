package by.etc.algoritm.decomposition;

/* Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.*/

public class TaskEleven {
    public static void main(String[] args) {
        task(12345,1234);
    }

    private static void task(int one, int two) {
        int number;


        number = maxQuantityOfDigits(one, two);

        if(number != one + two) {
            System.out.println("В числе " + number + " больше цифр чем в " + (number == one ? two : one));
        } else {
            System.out.println("В обоих числах одинаковое количество цифр.");
        }
    }

    private static int quantityOfDigits(int number) {
        int count = 0;
        int temp = number;

        while (temp != 0) {
            count++;
            temp /= 10;
        }
        return count;
    }

    private static int maxQuantityOfDigits(int one, int two) { // этот метод возвращает число в котором больше цифр, если числа равны возвращает их сумму
        int a = quantityOfDigits(one);
        int b = quantityOfDigits(two);

        if(a != b) {
            if (a > b) {
                return one;
            } else {
                return two;
            }
        } return one + two;
    }
}
