package by.etc.class_task.aggregation_composition.task_one;

/* Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
         консоль текст, заголовок текста.*/

public class Text {
    private String title;
    private Sentence[] sentanses;

     Text(Sentence[] sentanses, String title) {
        this.sentanses = sentanses;
        this.title = title;
    }

    public Sentence[] getSentanses() {
        return sentanses;
    }

    public void setSentanses(Sentence[] sentanses) {
        this.sentanses = sentanses;
    }

    public void printText() {
        System.out.println();
        for (Sentence s : sentanses) {
            for (Word w : s.getWords()) {
                System.out.print(w.getWord() + " ");
            }
        }
    }

    public void printTitle() {
        System.out.println(title);
    }

    public void addText(String text) {
        String[] strings = text.split("([.!?]+[.!?])");
        for(int j = 0; j < strings.length; j++) {
            String[] wrds = strings[j].split(" ");
            Word[] words = new Word[wrds.length];

            for(int k = 0; k < wrds.length; k++){
                words[k] = new Word(wrds[k]);
            }

            Sentence sent = new Sentence(words);

            Sentence[] temp = new Sentence[sentanses.length + 1];
            for (int i = 0; i < sentanses.length; i++) {
                temp[i] = sentanses[i];
            }
            temp[temp.length - 1] = sent;
            setSentanses(temp);
        }
    }
}

