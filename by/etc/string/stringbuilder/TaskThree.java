package by.etc.string.stringbuilder;

/* Проверить, является ли заданное слово палиндромом*/

public class TaskThree {
    public static void main(String[] args) {
        task();
    }

    private static void task(){
        String string = "Tenet";
        String answer;

        answer = isPalindrom(string) ? " является палиндромом !" : " не является палиндромом !";
        System.out.println("Слово \"" + string + "\" -" + answer);
    }

    private static boolean isPalindrom(String string){
        string = string.toUpperCase();
        boolean hasDiff = false;
        int i;
        int j;
        for( i = 0, j = string.length() - 1; i < j; i++, j--){
            if(string.charAt(i) != string.charAt(j)){
                hasDiff = true;
            }
        }
        return !hasDiff;
    }
}
