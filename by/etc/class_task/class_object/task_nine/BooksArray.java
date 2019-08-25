package by.etc.class_task.class_object.task_nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Создать класс Electronic, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
         метод toString(). Создать второй класс, агрегирующий массив типа Electronic, с подходящими конструкторами и
         методами. Задать критерии выбора данных и вывести эти данные на консоль.
         Electronic: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
         Найти и вывести:
         a) список книг заданного автора;
         b) список книг, выпущенных заданным издательством;
         c) список книг, выпущенных после заданного года.*/

public class BooksArray {
    Book[] books;

    public BooksArray () throws IOException{
        this.books = createBooks();
    }

    public BooksArray (Book[] books){
        this.books = books;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    private Book[] createBooks() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Book[] books;

        System.out.print("Введите количество книг ");

        int quantity = Integer.parseInt(reader.readLine());

        books = new Book[quantity];

        for (int i = 0; i < books.length; i++) {
            System.out.print("Введите id: ");
            int id = Integer.parseInt(reader.readLine());
            System.out.print("Введите название: ");
            String title = reader.readLine();
            System.out.print("Введите автора(ов): ");
            String author = reader.readLine();
            System.out.print("Введите издателя: ");
            String publisher = reader.readLine();
            System.out.print("Введите год издания: ");
            int year = Integer.parseInt(reader.readLine());
            System.out.print("Введите кол-во страниц: ");
            int pages = Integer.parseInt(reader.readLine());
            System.out.print("Введите цену: ");
            double price = Double.parseDouble(reader.readLine());
            System.out.print("Введите тип переплета: ");
            String bindingType = reader.readLine();

            books[i] = new Book(id, title, author, publisher, year, pages, price, bindingType);

            System.out.println();
            System.out.println();
        }
        return books;
    }

    public void printAuthor() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ВВедите автора");
        String author = br.readLine();

        for (int i = 0; i < books.length; i++) {
            if (books[i].getAuthor().contains(author)) {
                System.out.println(books[i]);
            }
        }
    }

    public void printPublisher() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ВВедите издательство");
        String publisher = br.readLine();

        for (int i = 0; i < books.length; i++) {
            if (books[i].getPublisher().equals(publisher)) {
                System.out.println(books[i]);
            }
        }
    }

    public void printYear() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ВВедите год");
        int year = Integer.parseInt(br.readLine());

        for (int i = 0; i < books.length; i++) {
            if(books[i].getYear() >= year) {
                System.out.println(books[i]);
            }
        }

    }

    public void print(){
        for(Book book : books){
            System.out.println("/////////////////////////////////////////////");
            System.out.println(book.toString());
            System.out.println("/////////////////////////////////////////////");
        }
    }
}
