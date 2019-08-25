package by.etc.final_task.task_four;

public class Dock {
    private int id;
    private int containers;

    public Dock(int id) {
        containers = 20;
        this.id = id;
    }

    public int getContainers() {
        return containers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isHasSpace() {
        return containers < 20;
    }

    public synchronized boolean load() {
        if (containers < 20) {
            containers++;
            System.out.println("Док " + id + " загрузил 1 контейнер !");
            return true;
        } else {
            System.out.println("Док " + id + " полон и готов к разгрузке контейнеров !");
            return false;
        }
    }

    public synchronized boolean unLoad() {
        if (containers > 0) {
            containers--;
            System.out.println("Док " + id + " выгрузил 1 контейнер !");
            return true;
        } else {
            System.out.println("Док " + id + " пуст и готов к погрузке контейнеров !");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Dock{" +
                ", containers=" + containers +
                '}';
    }
}
