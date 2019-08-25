package by.etc.class_task.class_object.task_five;

public class Counter {
    private int count = 0;

    public Counter() {
        count = (int) (Math.random() * 100);
    }

    public Counter(int count) {
        this.count = count;
    }

    public void increase() {
        count++;
    }

    public void decrease() {
        count--;
    }

    public void setcount(int count) {
        this.count = count;
    }

    public int getcount() {
        return count;
    }

    @Override
    public String toString() {
        return "Counter {" +
                "count = " + count +
                '}';
    }
}