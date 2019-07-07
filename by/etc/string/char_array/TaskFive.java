package by.etc.string.char_array;

/*Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
        Крайние пробелы в строке удалить.*/

public class TaskFive {

    public static void main(String[] args) {
        task();
    }

    private static void task() {
        String text = " I   see this  word, hear this      word, feel this word everywhere. ";
        char[] chars = text.toCharArray();

        printChars(chars);
        printChars(cutExtraSpaces(chars));

    }

    private static char[] cutExtraSpaces(char[] chars){
        char[] arr;
        int num;
        int count = 0;
        boolean isWord = false;

        num = getLengthOfNewArr(chars);
        arr = new char[num];

        for (int i = 0; i < chars.length; i++) {

            if (chars[i] != 32) {
                arr[count++] = chars[i];
                isWord = true;
            } else if(isWord && i < chars.length - 1){
                arr[count++] = 32;
                isWord = false;
            }
        }
        return arr;
    }

    private static void printChars(char[] chars) { // печать массива символов
        System.out.println();
        for (char ch : chars) {
            System.out.print(ch);
        }
        System.out.println();
    }

    private static int getLengthOfNewArr(char[] chars){ // метод возвращает число найденных слов
        int letters = 0;
        int num = 0;
        boolean isWord = false;

        for (int i = 0; i < chars.length; i++) {

            if (chars[i] != 32) {
                letters++;
                isWord = true;
                if(i == chars.length - 1){
                    num++;
                }
            } else if(isWord ){
                num++;
                isWord = false;
            }
        }

        return num + letters - 1; // -1 (по условию задачи правильное количество пробелов = num - 1(количество слов - 1),
                                   // а размер нового массива = кол-во всех букв + правыильное кол-во пробелов )
    }
}
