package by.etc.string.char_array;

/*В строке найти количество цифр*/

public class TaskThree {
    public static void main(String[] args) {
        task();
    }

    private static void task(){
        String string = "Число 48 можно представить как произведение чисел 3 и 16 : 48 = 3 * 16 ";
        char[] chars = string.toCharArray();

        printChars(chars);
        System.out.println("Количество цифр в строке = " + numOfDigits(chars));
    }

    private static int numOfDigits(char[] chars){ // метод возвращает число найденных цифр
            int num = 0;

            for (int i = 0; i < chars.length; i++) {

                if (chars[i] >= 48 && chars[i] <= 57) {
                    num++;
                }
            }

        return num;
    }

    private static void printChars(char[] chars) { // печать массива символов
        System.out.println();
        for (char ch : chars) {
            System.out.print(ch);
        }
        System.out.println();
    }
}
