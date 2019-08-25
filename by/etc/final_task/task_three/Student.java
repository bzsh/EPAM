package by.etc.final_task.task_three;

public class Student {

    private int id;
    private String name;
    private String surname;
    private int averageMark;

    public Student(int id, String name, String surname, int averageMark) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.averageMark = averageMark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(int averageMark) {
        this.averageMark = averageMark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString() {
        return getId() + " " + getName() + " " + getSurname() + " " + getAverageMark();
    }
}
