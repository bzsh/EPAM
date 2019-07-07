package by.etc.string.stringbuilder;

 /*Вводится строка. Требуется удалить из нее повторяющиеся
  символы и все пробелы. Например, если было введено "abc cde
   def", то должно быть выведено "abcdef".*/

public class TaskSeven {

    public static void main(String[] args) {
        task();
    }

    private static void task(){
        String string = "abc cde def";

        System.out.println(string);
        string = remover(string);
        System.out.println(string);
    }

    private static String remover(String string) {
        String temp = "";
        char ch;

        for (int i = 0; i < string.length(); i++) {
            ch = string.charAt(i);
            if (!(temp.contains(String.valueOf(ch))) && ch != ' ') {
                temp += string.charAt(i);
            }
        }
        return temp;
    }
}
