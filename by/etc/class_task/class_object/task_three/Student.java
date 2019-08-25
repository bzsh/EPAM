package by.etc.class_task.class_object.task_three;

public class Student {
    private String fio;
    private int groupNumber;
    private int[] marks = new int[5];

    public Student(String fio, int groupNumber){
        this.fio = fio;
        this.groupNumber = groupNumber;
    }

    public Student() {
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }
}
