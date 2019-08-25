package by.etc.final_task.task_one.library.catalog;

import by.etc.final_task.task_one.book.Book;

import java.io.Serializable;
import java.util.ArrayList;

public class Catalog implements Serializable {
    private ArrayList<Book> catalog = new ArrayList<Book>();

    public ArrayList<Book> getBooks() {
        return catalog;
    }

    public void addBook(Book book){
        catalog.add(book);
    }

    public void delBook(Book book){
        catalog.remove(book);
    }
}
