package by.etc.class_task.aggregation_composition.task_four;

/* Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
         счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
         всем счетам, имеющим положительный и отрицательный балансы отдельно.*/

public class Account {
        private String number;
        private int money;
        private boolean bloked;

    public Account(String number, int money, boolean bloked) {
        this.number = number;
        this.money = money;
        this.bloked = bloked;
    }

    public Account() {
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public boolean isBloked() {
        return bloked;
    }

    public void setBloked(boolean bloked) {
        this.bloked = bloked;
    }
}
