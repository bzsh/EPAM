package by.etc.string.stringbuilder;

/* Строка X состоит из нескольких предложений, каждое
из которых кончается точкой, восклицательным или вопросительным
знаком. Определить количество предложений в строке X.*/


public class TaskTen {

    public static void main(String[] args) {
        task();
    }

    private static void task() {
        String string = "Blendo had the first effective implementation of" +
                " the full-body kinetic energy spinner weapon that became" +
                " common in Robot Wars. The robot had a shell made from a " +
                "wok and was spun by a lawnmower engine! Blades attached to" +
                " the shell caused damage to its opponents, removing bodywork" +
                " and in some instances causing them to be thrown over the" +
                " polycarbonate safety shields into the audience?";
        System.out.println("Quantity of sentences : " + countOfSentence(string));
    }

    private static int countOfSentence(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '.' || string.charAt(i) == '!' || string.charAt(i) == '?') {
                count++;
            }
        }
        return count;
    }

}
