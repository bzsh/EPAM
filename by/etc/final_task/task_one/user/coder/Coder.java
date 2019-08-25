package by.etc.final_task.task_one.user.coder;

public class Coder {

   public static String decode(String encoded){
       char[] arr = encoded.toCharArray();
       for(int i = 0; i < arr.length; i++ ){
           arr[i] = (char) (arr[i] - i);
       }
       return String.valueOf(arr);
   }

    public static String encode(String password){
        char[] arr = password.toCharArray();
        for(int i = 0; i < arr.length; i++ ){
            arr[i] = (char) (arr[i] + i);
        }
        return String.valueOf(arr);
    }
}
