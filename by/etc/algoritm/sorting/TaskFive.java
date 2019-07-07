package by.etc.algoritm.sorting;

/*
Сортировка обменами.
 Дана последовательность чисел a1 , a2 ... an
 Требуется переставить числа в порядке возрастания.
 Делается это следующим образом.
 Пусть a1, a2, ai - упорядоченная последовательность, т. е.
 a1 <= a2 <=...<= an. Берется следующее число a i+1
 и вставляется в последовательность так, чтобы новая
 последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i+1 до n
 не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить
 с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
*/

public class TaskFive {

    public static void main(String[] args) {
        task(20);
    }

    private static void task(int n) {

        int[] arr = new int[n];
        int index;
        int temp;

        for (int i = 0; i < arr.length; i++) {          // заполнение массива числами от 0 - 99
            arr[i] = (int) (Math.random() * 100);
        }

        System.out.println();

        for (int i : arr) {                             // печать массива
            System.out.print(i + "\t");
        }

        System.out.println();

        for (int i = 1; i < arr.length; i++) {         //сортировка вставками

            index = binarySearch(arr, 0, i, arr[i]);   // узнаем индекс вставки

                for (int j = i; j > index; j--) {      // продвигаем arr[i] к месту вставки в отсортированной части массива
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }

        }

        System.out.println();

        for (int i : arr) {                             // печать отсортированного массива
            System.out.print(i + "\t");
        }
    }

    /*метод для поиска индекса элемента
    согласно условию задачи в
    заданной части массива*/

    public static int binarySearch(int[] array, int start, int end, int value) {

        int mid;

        if(start == end){
            return start;
        }
            mid = start + ((end - start) / 2);            // рассчет центра массива

            if( value > array[mid]){                      // если число в центре меньше проверяемого

                return binarySearch(array, mid + 1, end, value); // то сдвигаем область поиска на правую половину массива и снова ищем

            } else if(value < array[mid]){ // иначе проверяем : если число в центре больше проверяемого

                    return binarySearch(array, start, mid, value); // то сдвигаем область поиска на левую половину массива и снова ищем
                }
        return mid;
    }
}
