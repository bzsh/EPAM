package by.etc.class_task.class_object.task_one;

public class Test1 {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSum() {
        return x + y;
    }

    public int getMax() {
        return x > y ? x : y;
    }

    public void print(){
        System.out.println("x = " + x + ", y = " + y + ".");
    }
}
