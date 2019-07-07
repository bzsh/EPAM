package by.etc.string.stringbuilder;

/*Вводится строка слов, разделенных пробелами.
Найти самое длинное слово и вывести его на экран. Случай,
когда самых длинных слов может быть несколько, не обрабатывать.*/

public class TaskEight {

    public static void main(String[] args) {
        task();
    }

    private static void task() {
        String string = "Вводится строка слов разделенных пробелами Найти самое длинное слово и вывести экран Случай когда самых длинных слов может быть несколько не обрабатывать синхрофазатрон";
        maxLength(string);
    }

    private static void maxLength(String string) {
        int count = 0;
        String[] arr;
        int maxIndex = 0;

        arr = string.split(" ");

        for (int i = 1; i < arr.length; i++) {
            if (arr[i].length() > arr[maxIndex].length()) {
                maxIndex = i;
            }
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].length() == arr[maxIndex].length()) {
                count++;
            }
        }
        if (count == 1) {
            System.out.println(arr[maxIndex]);
        }
    }
}