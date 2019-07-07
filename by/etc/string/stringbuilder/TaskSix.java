package by.etc.string.stringbuilder;

/*Из заданной строки получить новую, повторив каждый символ дважды.*/

public class TaskSix {

    public static void main(String[] args) {
        task();
    }

    private static void task(){
        String string = "Из заданной строки получить новую, повторив каждый символ дважды.";
        System.out.println(string);
        System.out.println(getStringWithPairs(string));
    }

    private static String getStringWithPairs(String string){
        String str = "";

        for(int i = 0; i < string.length(); i++){
            str += string.charAt(i);
            str += string.charAt(i);
        }
        return str;
    }
}
