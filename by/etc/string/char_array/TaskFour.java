package by.etc.string.char_array;

/* В строке найти количество чисел.*/

public class TaskFour {

    public static void main(String[] args) {
        task();
    }

    private static void task(){
        String string = "Число 48 можно представить как произведение чисел 3 и 16 :   48 = 3 * 16 ";
        char[] chars = string.toCharArray();

        printChars(chars);
        System.out.println("Количество чисел в строке = " + numOfNums(chars));
    }

    private static int numOfNums(char[] chars){ // метод возвращает число найденных чисел
        int num = 0;
        boolean isDigit = false;

        for (int i = 0; i < chars.length; i++) {

            if (chars[i] >= 48 && chars[i] <= 57) {
                isDigit = true;
                if(i == chars.length - 1){
                    num++;
                }
            } else if(isDigit){
                num++;
                isDigit = false;
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

/*
 for (int j = i + 1; j < chars.length; j++) {
        if(chars[i] >= 48 && chars[i] <= 57) {

        }
        }*/
