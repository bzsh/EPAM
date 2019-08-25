package by.etc.oop.task_one;

/*        Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
        вывести на консоль содержимое, дополнить, удалить.*/


public class Directory {
    private String directory;

    public Directory(String directory){
        this.directory = directory;
    }

    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }
}
