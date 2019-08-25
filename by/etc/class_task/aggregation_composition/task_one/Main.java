package by.etc.class_task.aggregation_composition.task_one;

/* Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
         консоль текст, заголовок текста.*/

public class Main {
    public static void main(String[] args) {
        Text text;
        Sentence[] sentences;
        Word[] words;

        words = new Word[]{new Word("Hello"), new Word("world"), new Word("!")};
        sentences = new Sentence[]{new Sentence(words)};
        text = new Text(sentences, "Title");

        text.printTitle();
        text.printText();
        System.out.println();
        text.addText("Hello kitty ! Hello friend !");
        text.printText();

    }
}
