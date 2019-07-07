package by.etc.algoritm.array;

public class TaskOne {

    public static void main(String[] args) {

        task(4);
    }

    private static void task(int k){

        int[] arr;
        int sum = 0;

        arr = new int[]{1,23,52,76,57,65,43,34,46,68,46,47};

        for(int i = 0; i < arr.length; i++ ){

            if( arr[i] % k == 0) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
}
