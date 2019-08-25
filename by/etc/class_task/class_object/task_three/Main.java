package by.etc.class_task.class_object.task_three;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[10];
        students[0] = new Student("aaa", (int)(Math.random() * 20 + 1));
        students[1] = new Student("bbb", (int)(Math.random() * 20 + 1));
        students[2] = new Student("ccc", (int)(Math.random() * 20 + 1));
        students[3] = new Student("fff", (int)(Math.random() * 20 + 1));
        students[4] = new Student("ggg", (int)(Math.random() * 20 + 1));
        students[5] = new Student("hhh", (int)(Math.random() * 20 + 1));
        students[6] = new Student("ddd", (int)(Math.random() * 20 + 1));
        students[7] = new Student("eee", (int)(Math.random() * 20 + 1));
        students[8] = new Student("ttt", (int)(Math.random() * 20 + 1));
        students[9] = new Student("iii", (int)(Math.random() * 20 + 1));


        for(int i = 0; i < students.length; i++){
            int[] marks = new int [5];
            for(int j = 0; j < marks.length; j++){
                marks[j] = 3 + (int)(Math.random() * 8);
            }
            students[i].setMarks(marks);
        }

        for( int i = 0; i < students.length; i++){
            boolean isGoodStudent = true;
            int[] marks = students[i].getMarks();
            for(int j = 0; j < marks.length; j++ ){
                if(marks[j] < 9){
                    isGoodStudent = false;
                }
            }
            if(isGoodStudent){
                System.out.println("Студент : " + students[i].getFio() + "  из " + students[i].getGroupNumber() + " группы имеет оценки только  9 или 10");
            }
        }
    }
}
