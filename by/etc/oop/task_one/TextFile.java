package by.etc.oop.task_one;

/*        Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
        вывести на консоль содержимое, дополнить, удалить.*/


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TextFile {
    private Directory directory;
    private File file;

    TextFile(Directory directory) {
        this.directory = directory;
    }

    public File getFile() {
        return file;
    }

    void writeToFile(String string) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);

            fileOutputStream.write(string.getBytes());

            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

     void createFile(){
        file = new File(directory.getDirectory());
    }

    void addToFile(String string){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file, true);

            fileOutputStream.write(string.getBytes());
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

     void printFile() {
         System.out.println();
        try {
            FileInputStream fis = new FileInputStream(directory.getDirectory());
            int i;
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
         System.out.println();
    }

    boolean renameFile(String string){
        boolean result = true;
        directory.setDirectory(string);
        if(file.exists()){
           result = file.renameTo(new File(string));
    }
        file.delete();
        file = new File(directory.getDirectory());

    return result;}

    void deleteFile(){
        file.delete();
    }
}
