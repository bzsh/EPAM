package by.etc.final_task.task_one.book;

import java.io.Serializable;

public class Paper implements Serializable, Book {
    private String title;
    private String author;
    private int pages;

    public Paper(String title, String author, int pages){
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

    @Override
    public String toString() {
        return "Бумажная книга {" +
                "title = '" + title + '\'' +
                ", author = '" + author + '\'' +
                ", pages = " + pages +
                '}';
    }

}

