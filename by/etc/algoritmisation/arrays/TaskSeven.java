package by.etc.algoritmisation.arrays;

public class TaskSeven {
    public static void main(String[] args) {
        task(100);
    }

    private static void task(int n){

        int[]arr = new int[n];
        int maxSum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }

        for(int i = 0; i < arr.length / 2; i++){
            if(arr[i] + arr[arr.length - 1 - i] > maxSum){
                maxSum = arr[i] + arr[arr.length - 1 - i];
            }
        }

        System.out.println(maxSum);

    }

}
