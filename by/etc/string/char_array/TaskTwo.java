package by.etc.string.char_array;

/*Замените в строке все вхождения 'word' на 'letter'*/

public class TaskTwo {
    public static void main(String[] args) {
        task();
    }

    private static void task() {
        String text = "I see this word, hear this word, feel this word everywhere.";
        char[] chars = text.toCharArray();
        char[] word = new char[]{'w', 'o', 'r', 'd'};
        char[] replace = new char[]{'l', 'e', 't', 't', 'e', 'r'};


        printChars(chars);
        chars = wordChanger(chars, word, replace);
        printChars(chars);

    }

    private static char[] wordChanger(char[] chars, char[] word, char[] replace) {  // метод подменяет искомую (word) последовательность символов
        int count;                                                                  // на переданую в аргументе (replace) и возвращает новый массив
        int len;
        char[] arr;
        int j = 0;

        count = getNumOfWords(chars, word);
        len = word.length < replace.length ? (replace.length - word.length) * count + chars.length : (word.length - replace.length) * count + chars.length;
        arr = new char[len];
        count = 0;

        for (int i = 0; i < chars.length; i++) {
            arr[count++] = chars[i];

            if (j < word.length && chars[i] == word[j]) {
                j++;

            } else {
                if (j == word.length) {

                    j = 0;
                    count = count - word.length - 1;

                    while (j < replace.length) {
                        arr[count++] = replace[j];
                        j++;
                    }
                    i--;
                }
                j = 0;
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

    private static int getNumOfWords(char[] chars, char[] word) { // метод возвращает число найденных слов
        int num = 0;
        int j = 0;

        for (int i = 0; i < chars.length; i++) {

            if (j < word.length && chars[i] == word[j]) {
                j++;
            } else {
                if (j == word.length) {
                    num++;
                }
                j = 0;
            }
        }
        return num;
    }
}
