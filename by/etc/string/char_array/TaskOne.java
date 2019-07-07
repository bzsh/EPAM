package by.etc.string.char_array;

/* Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.*/

public class TaskOne {
    public static void main(String[] args) {
        task();
    }

    private static void task() {
        int count;
        String[] strings = new String[]{"camelCase", "inputStreamReader", "parseInt", "bufferedReader"};

        printStrings(strings);
        System.out.println("________________________");

        for (int i = 0; i < strings.length; i++) {
            count = 0;
            char[] chars = strings[i].toCharArray();

            for (int j = 0; j < chars.length; j++) {
                if (chars[j] >= 65 && chars[j] <= 90) {
                    count++;
                }
            }
            char[] temp = new char[chars.length + count];

            count = 0;
            for (int j = 0; j < chars.length; j++) {
                if (chars[j] >= 65 && chars[j] <= 90) {
                    temp[count++] = 95;
                    temp[count++] = (char) (chars[j] + 32);
                } else {
                    temp[count++] = chars[j];
                }
            }
            strings[i] = String.valueOf(temp);
        }
        printStrings(strings);
    }

    private static void printStrings(String[] strings) {
        for (String s : strings) {
            System.out.println("\n" + s);
        }
    }
}

