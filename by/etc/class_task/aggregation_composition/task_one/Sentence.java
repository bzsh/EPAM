package by.etc.class_task.aggregation_composition.task_one;

/* Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
         консоль текст, заголовок текста.*/

public class Sentence {
    private Word[] words;

    public Sentence(Word[] words) {
        this.words = words;
    }

    public Word[] getWords() {
        return words;
    }

    public void setWords(Word[] words) {
        this.words = words;
    }

    public void addWord(Word w){
        Word[] temp = new Word[words.length + 1];
        for(int i = 0; i < words.length; i++){
            temp[i] = words[i];
        }
        temp[temp.length - 1] = w;
        setWords(temp);
    }
}
