package by.etc.class_task.class_object.task_eight;

public class Customer {
    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private String address;
    private int cardNumber;
    private int bankAccountNumber;

    public Customer(int id, String surname, String name, String patronymic, String address, int cardNumber, int bankAccountNumber) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.cardNumber = cardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getsurname() {
        return surname;
    }

    public void setsurname(String surname) {
        this.surname = surname;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getpatronymic() {
        return patronymic;
    }

    public void setpatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(int bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id = " + id +
                ", surname = '" + surname + '\'' +
                ", name = '" + name + '\'' +
                ", patronymic = '" + patronymic + '\'' +
                ", address = '" + address + '\'' +
                ", cardNumber = " + cardNumber +
                ", bankAccountNumber = " + bankAccountNumber +
                '}';
    }
}
