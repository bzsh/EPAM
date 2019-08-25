package by.etc.class_task.class_object.task_eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
        и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
        и методами. Задать критерии выбора данных и вывести эти данные на консоль.
        Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
        Найти и вывести:
        a) список покупателей в алфавитном порядке;
        b) список покупателей, у которых номер кредитной карточки находится в заданном интервале*/

public class CustomersArray {
    private Customer[] customers;

    public CustomersArray() throws IOException{
        this.customers = createCustomers();
    }

    public CustomersArray(Customer[] customers){
        this.customers = customers;
    }

    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }

    public Customer[] getCustomers() {
        return customers;
    }

    private Customer[] createCustomers() throws IOException {
        Customer[] customers;
        int quantity;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите количество клиентов ");

        quantity = Integer.parseInt(br.readLine());
        customers = new Customer[quantity];

        for (int i = 0; i < customers.length; i++) {
            System.out.print("Введите id ");
            int id = Integer.parseInt(br.readLine());
            System.out.print("Введите фамилию ");
            String surname = br.readLine();
            System.out.print("Ввидите имя ");
            String name = br.readLine();
            System.out.print("Ввидите отчество ");
            String patronymic = br.readLine();
            System.out.print("Ввидите адрес ");
            String address = br.readLine();
            System.out.print("Ввидите номер кредитной карты ");
            int cardNumber = Integer.parseInt(br.readLine());
            System.out.print("Ввидите  номер банковского счета ");
            int bankAccountNumber = Integer.parseInt(br.readLine());

            customers[i] = new Customer(id, surname, name, patronymic, address, cardNumber, bankAccountNumber);
            System.out.println();
            System.out.println();
        }
        return customers;
    }

    public void lexicalSort(){
        Customer temp;
        for (int i = customers.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (customers[i - 1].getsurname().compareTo(customers[i].getsurname()) > 0) {
                    temp = customers[j];
                    customers[j] = customers[j + 1];
                    customers[j + 1] = temp;
                }else  if (customers[i - 1].getsurname().compareTo(customers[i].getsurname()) == 0) {
                    if (customers[i - 1].getname().compareTo(customers[i].getname()) > 0) {
                        temp = customers[j];
                        customers[j] = customers[j + 1];
                        customers[j + 1] = temp;
                    } else if (customers[i - 1].getname().compareTo(customers[i].getname()) == 0) {
                        if (customers[i - 1].getpatronymic().compareTo(customers[i].getpatronymic()) > 0) {
                            temp = customers[j];
                            customers[j] = customers[j + 1];
                            customers[j + 1] = temp;
                        }
                    }
                }
            }
        }
    }

    public void printByInterval()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ВВедите интервал поиска номеров кредитных карт");
        System.out.println(" с : ");
        int stert = Integer.parseInt(br.readLine());
        System.out.println("по : ");
        int end = Integer.parseInt(br.readLine());
        for(int i = 0; i < customers.length; i++){
            if(customers[i].getCardNumber()>= stert && customers[i].getCardNumber() <= end){
                System.out.println(customers[i].toString());
            }
        }
    }

    public void print(){
        for(Customer c : customers){
            System.out.println("/////////////////////////////////////////////////////////////////");
            System.out.println(c.toString());
            System.out.println("/////////////////////////////////////////////////////////////////");
        }
    }
}
