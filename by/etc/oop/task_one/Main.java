package by.etc.oop.task_one;

/*        Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
        вывести на консоль содержимое, дополнить, удалить.*/

public class Main {
    public static void main(String[] args){
        Directory directory = new Directory("C:\\Users\\Push\\Desktop\\EPAM TASKS\\EPAM\\src\\by\\etc\\oop\\task_one\\New.txt");
        TextFile textFile = new TextFile(directory);

        textFile.createFile();

        textFile.writeToFile("Hello World!");

        textFile.printFile();

        textFile.addToFile("!!!!!");

        textFile.printFile();

        System.out.println(textFile.getFile().getPath());

        textFile.renameFile("C:\\Users\\Push\\Desktop\\EPAM TASKS\\EPAM\\src\\by\\etc\\oop\\task_one\\Newwwwww.txt");

        System.out.println(textFile.getFile().getPath());

        textFile.printFile();

        textFile.deleteFile();

    }
}
