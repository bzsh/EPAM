package by.etc.oop.task_five;

public enum TypeOfSweet {
    CHOCOLATE("шоколадка"),
    COOKIE("печенька"),
    CANDY("конфета"),
    GUM("жвачка"),
    LOLLIPOP("леденец");

     String title;

    TypeOfSweet(String title) {
        this.title = title;
    }
}
