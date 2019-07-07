package by.etc.string.stringbuilder;

/* Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.*/

public class TaskOne {
    public static void main(String[] args) {
        task();
    }

    private static void task(){
        String text = " I   see this  word, hear this      word, feel this word everywhere. ";

        System.out.println(text);
        System.out.println("Наибольшее количество подряд идущих пробелов в строке равно : " + getMaxNumOfSpaces(text));

    }

    private static int getMaxNumOfSpaces(String string){
        int count = 0;
        int max = 0;

        for(int i = 0; i < string.length(); i++){
            if(string.charAt(i) == 32){
                count++;
                if(count > max){
                    max = count;
                }
            } else {
                count = 0;
            }
        }
        return max;
    }
}
