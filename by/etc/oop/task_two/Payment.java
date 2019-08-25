package by.etc.oop.task_two;

/*Создать класс Payment с внутренним классом,
 с помощью объектов которого можно сформировать
  покупку из нескольких товаров.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Payment {
    private String name;
    private int amount;
    private Product[] products;

    public Payment(String name) {
        this.amount = 0;
        this.name = name;
    }

    public Payment(){
        this.amount = 0;
        this.name = "Default name";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public void createOrder() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name;
        int price;
        int quantity;
        System.out.println("Ведите нужное количество товаров : ");
        quantity = Integer.parseInt(br.readLine());
        products = new Product[quantity];
        for(int i = 0; i < products.length; i++){
            System.out.println("Введите название требуемого товара : ");
            name = br.readLine();
            System.out.println("Введите цену товара : ");
            price = Integer.parseInt(br.readLine());
            amount += price;
            products[i] = new Product(name, price);
        }
        System.out.println("Платеж на общую сумму " + amount);
    }

    public void printPayment(){
        System.out.println("Перечень продуктов :");
        for(Product product : products){
            System.out.println(product.toString());
        }
    }

     private class Product{
        private String name;
        private int price;

         Product(String name, int price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "Наименование товара : " + name + " ; стоимость : " + price + " .";
        }
    }
}
