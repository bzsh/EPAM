package by.etc.final_task.task_one.book;

import java.io.Serializable;
import java.util.ArrayList;

public class Electronic implements Serializable, Book {
    private String title;
    private String author;
    private int pages;
    private ArrayList<String> contentPages;

    public Electronic(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public ArrayList<String> getContentPages() {
        return contentPages;
    }

    public void setContentPages(ArrayList<String> contentPages) {
        this.contentPages = contentPages;
    }

    @Override
    public String toString() {
        return "Электронная книга {" +
                "title = '" + title + '\'' +
                ", author = '" + author + '\'' +
                ", pages = " + pages +
                '}';
    }
}
