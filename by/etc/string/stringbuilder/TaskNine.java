package by.etc.string.stringbuilder;

/* Посчитать количество строчных (маленьких) и прописных (больших)
 букв в введенной строке. Учитывать только английские буквы.*/

public class TaskNine {
    public static void main(String[] args) {
        task();
    }

    private static void task() {

        String string = "The situation is different for people in Los Angeles and other West Coast cities.";
        int upCount = 0;
        int lowCount = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) >= 65 && string.charAt(i) <= 90) {
                upCount++;
            }
            if (string.charAt(i) >= 97 && string.charAt(i) <= 122) {
                lowCount++;
            }
        }
        System.out.println("Прописных : " + upCount);
        System.out.println("Строчных : " + lowCount);
    }

}
