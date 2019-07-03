package by.etc.basic.loop;

/*Даны 2 числа, определить цифры
 входящие в состав как первого
 так и второго числа*/

public class TaskEight {

    public static void main(String[] args) {

        task(25252525, 14521452);
    }

    private static void task(int a, int b) {
        int tempB = b;   //  временная b для перебора
        long uniNums = 0;  //  число состоящее из унакальных цисел из a и b
        long uniTemp;  //  временная унакольная для перебора
        boolean hasUniNum = false;// есть ли число в переменной хранящей только уникальные

        while (a != 0) {         // сравниваем а с временной для b (tempB)

            while (tempB != 0) {

                if (a % 10 == tempB % 10) {  // есть одинаковое число из а в b

                    uniTemp = uniNums;

                    while (uniTemp != 0) { // проверяем на уникальность(нет ли повторов)
                        if (uniTemp % 10 == a % 10) {
                            hasUniNum = true;
                        }
                        uniTemp /= 10; // уменьшаем проверяемое число на разряд
                    }
                    if (!hasUniNum) {
                        uniNums = uniNums * 10 + (a % 10); // формируем уникальное число добавляя новое в новый разряд
                    }
                }
                tempB = tempB / 10; // уменьшаем проверяемое число на разряд
                hasUniNum = false; // сбрасываем флаг наличия числа среди уникальных
            }
            a /= 10; // уменьшаем проверяемое число на разряд
            tempB = b; // возвращаем значение b в tempB для следующего поиска
        }
        System.out.println("Цифры" +
                " входящие в состав как первого" +
                " так и второго числа :" + uniNums);
    }
}


























        /*String one = String.valueOf(a);
        String two = String.valueOf(b);
        char[] arr = one.toCharArray();
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {

            if (two.contains(String.valueOf(arr[i]))) {

                set.add(arr[i]);
            }
        }

        for (Character ch : set) {

            System.out.print(ch + " ");
        }*/