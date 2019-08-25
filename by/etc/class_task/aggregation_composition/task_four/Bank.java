package by.etc.class_task.aggregation_composition.task_four;

/* Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
         счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
         всем счетам, имеющим положительный и отрицательный балансы отдельно.*/

public class Bank {
    private Client[] clients;

    public Bank(int n) {
        clients = clientGenerator(n);
    }

    public Bank(Client[] clients) {
        this.clients = clients;
    }

    public Client[] getClients() {
        return clients;
    }

    public void setClients(Client[] clients) {
        this.clients = clients;
    }

    public void printClients() {
        System.out.println("Список клиентов банка :");
        System.out.println("Имя клиента | количество счетов");
        for(Client client : clients){
            System.out.print(client.getName()+ "\t" + client.getAccounts().length + "\n");
            System.out.println("\nНомер счета  |  баланс | статус счета");
            for(Account account : client.getAccounts()){
                System.out.print(account.getNumber() + "\t   " + account.getMoney() + "   " + (account.isBloked() ? " счет заблокирован" : "счет открыт"));
                System.out.println();
            }
        }
    }

    public void printPositiveSum() {
        int sum = 0;
        for (int i = 0; i < clients.length; i++) {
            for (int j = 0; j < clients[i].getAccounts().length; j++) {
                if(!(clients[i].getAccounts()[j].isBloked()) && clients[i].getAccounts()[j].getMoney() > 0) {
                    sum += clients[i].getAccounts()[j].getMoney();
                }
            }
        }
        System.out.println("Сумма по счетам имеющих положительные балансы - " + sum);
    }

    public void printNegativeSum() {
        int sum = 0;
        for (int i = 0; i < clients.length; i++) {
            for (int j = 0; j < clients[i].getAccounts().length; j++) {
                if(!(clients[i].getAccounts()[j].isBloked()) && clients[i].getAccounts()[j].getMoney() < 0) {
                    sum += clients[i].getAccounts()[j].getMoney();
                }
            }
        }
        System.out.println("Сумма по счетам имеющих отрицательные балансы - " + sum);
    }

    public void printSumAccounts() {
        int sum = 0;
        for (int i = 0; i < clients.length; i++) {
            for (int j = 0; j < clients[i].getAccounts().length; j++) {
                if(!(clients[i].getAccounts()[j].isBloked())) {
                    sum += clients[i].getAccounts()[j].getMoney();
                }
            }
        }

        System.out.println("Сумма по всем счетам - " + sum);
    }

    public void printByClientName(String name){
        for(Client client : clients){
            if(client.getName().equals(name)){
                System.out.println("Имя клиента | количество счетов");
                System.out.print(client.getName()+ "\t" + client.getAccounts().length + "\n");
                System.out.println("\n Номер счета  |  баланс | статус счета");
                for(Account account : client.getAccounts()){
                    System.out.print(account.getNumber() + " " + account.getMoney() + " " + (account.isBloked() ? " счет заблокирован" : "счет открыт\n"));
                    System.out.println();
                }
            }
        }
    }

    public void printByAccountNumber(String number){
        for(Client client : clients){
           for(Account account : client.getAccounts()){
               if(account.getNumber().equals(number)){
                   System.out.println("Счет номер :" + number + " принадлежит клиенту : " + client.getName() + ".");
                   System.out.println("Статус счета : " + (account.isBloked() ? " заблокирован " : " открыт ") + " баланс : " + account.getMoney());
               }
           }
        }
    }

    public void sortByBalance(){
        for(Client client : clients){
            for (int i = client.getAccounts().length - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (client.getAccounts()[j].getMoney() > client.getAccounts()[j + 1].getMoney()) {
                        int temp = client.getAccounts()[j].getMoney();
                        client.getAccounts()[j].setMoney(client.getAccounts()[j + 1].getMoney());
                        client.getAccounts()[j + 1].setMoney(temp);
                    }
                }
            }
        }
    }

    private Client[] clientGenerator(int n){
        Client[] clients = new Client[n];
        for(int i = 0; i < clients.length; i++){
            Account[] accounts = new Account[5];
            for(int j = 0; j < accounts.length; j++){
                String number = String.valueOf((int)(Math.random() * 100000000));
                int money = (int)((Math.random() * 2000000000) - 1000000000);
                boolean block = ((int)((Math.random() * 100) - 50)) > 0;
                accounts[j] = new Account(number, money, block);
            }
            clients[i] = new Client("Client_" + i, accounts);
        }
        return clients;
    }
}
