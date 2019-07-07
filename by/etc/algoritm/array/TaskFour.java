package by.etc.algoritm.array;

public class TaskFour {
    public static void main(String[] args) {
        task(10);
    }
    private static void task(int n){
        int arr[] = new int[n];
        int max;
        int min;
        int indexMax = 0;
        int indexMin = 0;
        int temp;


        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((Math.random() * 200) - 100);
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        max = arr[0];
        min = arr[0];

        for(int i = 0; i < arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
                indexMax = i;
            }
            if(arr[i] < min){
                min = arr[i];
                indexMin = i;
            }
        }

        temp = arr[indexMax];
        arr[indexMax] = arr[indexMin];
        arr[indexMin] = temp;

        System.out.println();

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

}
