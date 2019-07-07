package by.etc.string.stringbuilder;

/* С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.*/

public class TaskFour {
    public static void main(String[] args) {
        task();
    }

    private static void task(){
        String word = "информатика";
        String tort;
        int index;

        index = word.indexOf("т");
        tort = String.valueOf(word.charAt(index));
        index = word.indexOf("о");
        tort += String.valueOf(word.charAt(index));
        index = word.indexOf("р");
        tort += String.valueOf(word.charAt(index));
        index = word.indexOf("т");
        tort += String.valueOf(word.charAt(index));

        System.out.println(tort);
    }
}
