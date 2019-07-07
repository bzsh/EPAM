package by.etc.string.stringbuilder;

/* Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.*/

public class TaskFive {

    public static void main(String[] args) {
        task();
    }

    private static void task(){
        char ch = 'а';
        String string = " Подсчитать, сколько раз среди символов заданной строки встречается буква “а”";
        System.out.println(sumOfChar(ch, string));

    }
    private static int sumOfChar (char ch, String string){
         int sum = 0;

        for(int i  = 0; i < string.length(); i++){
            if(string.charAt(i) == ch){
                sum++;
            }
        }

        return sum;
    }
}
