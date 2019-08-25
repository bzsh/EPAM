package by.etc.final_task.task_four;


public class Ship implements Runnable {
    private static int counter = 0;
    private int id;
    private int containers;

    public Ship() {
        id = counter++;
        containers = 0;
        System.out.println("Корабль id " + id + "успешно построен" + " корабль пуст");
    }

    public int getId() {
        return id;
    }

    public int getContainers() {
        return containers;
    }

    public void setContainers(int containers) {
        this.containers = containers;
    }


    @Override
    public void run() {

        while (true) {
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (isReadyToLoad()) {
                System.out.println("корабль " + id + " имеет в трюме " + containers + " контейнеров и готов к загрузке");
                load(Port.getDockToUnLoad());
            } else {
                System.out.println("корабль " + id + " полон и готов к разгрузке контейцнеров");
                unLoad(Port.getDockToLoad());
            }
        }
    }

    public void load(Dock dock) {
        System.out.println("Корабль " + id + " приступил к погрузке контейнеров !");
        while (isReadyToLoad()) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (dock.unLoad()) {
                containers++;
            } else {
                System.out.println("Корабль " + id + " покунул пничал");
                return;
            }
        }
    }

    public void unLoad(Dock dock) {
        System.out.println("Корабль " + id + " приступил к разгрузке контейнеров !");
        while (!isReadyToLoad()) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (dock.load()) {
                containers--;
            } else {
                System.out.println("Корабль " + id + " покунул пничал");
                return;
            }
        }
    }

    private boolean isReadyToLoad() {
        return containers < 20;
    }

}
