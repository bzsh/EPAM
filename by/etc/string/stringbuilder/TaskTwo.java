package by.etc.string.stringbuilder;

/* В строке вставить после каждого символа 'a' символ 'b'*/

public class TaskTwo {
    public static void main(String[] args) {
        task();
    }

    private static void task() {
        String text = "There are many variations of passages of Lorem Ipsum available";
        char charToAdd = 'b';
        char ch = 'a';

        System.out.println(text);
        System.out.println(addLetterToString(text, ch, charToAdd));
    }

    private static String addLetterToString(String string, char ch, char charToAdd) {
        StringBuilder sb = new StringBuilder();
        char temp;

        for (int i = 0; i < string.length(); i++) {
            temp = string.charAt(i);
            sb.append(temp);
            if (temp == ch) {
                sb.append(charToAdd);
            }
        }
        return sb.toString();

    }
}
