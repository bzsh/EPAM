package by.etc.final_task.task_one.library;

import by.etc.final_task.task_one.book.Book;
import by.etc.final_task.task_one.library.catalog.Catalog;
import by.etc.final_task.task_one.library.registration_data.RegData;
import by.etc.final_task.task_one.user.User;
import by.etc.final_task.task_one.user.coder.Coder;

import java.io.*;

public class Library {
    private static Library instance;
    private String catalogFileName = "src\\main\\java\\by\\etc\\final_task\\task_one\\library\\catalog\\catalogFile.txt";
    private String regDataFileName = "src\\main\\java\\by\\etc\\final_task\\task_one\\library\\registration_data\\reg.txt";
    private Catalog catalog = new Catalog();
    private RegData regData = new RegData();

    private Library(){

         FileInputStream regDataReader;
         FileInputStream catalogReader;
        try {
            catalogReader = new FileInputStream(catalogFileName);
            ObjectInputStream objectInputStream = new ObjectInputStream(catalogReader);
            Object o = objectInputStream.readObject();

            if(o != null){
            catalog = (Catalog)o;
            }
            catalogReader.close();
            objectInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


        try {
            regDataReader = new FileInputStream(regDataFileName);
            ObjectInputStream objectInputStream = new ObjectInputStream(regDataReader);
            Object o = objectInputStream.readObject();

            if(o != null) {
                regData = (RegData) o;
            }
             regDataReader.close();
             objectInputStream.close();
        } catch (FileNotFoundException e) {
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

    public static Library getInstance() {
        if(instance == null){
            instance =  new Library();
        }
            return instance;
    }

    public Catalog getCatalog() {
        return catalog;
    }

    public RegData getRegData() {
        return regData;
    }

    public void createAdmin(){
        User user = new User("admin@admin.ru", "admin", "admin");
        regData.addUser(user);
    }

    public void addUser(User user) {
        regData.addUser(user);                                    //   TODO
    }

    public void addBook(Book book) {
        catalog.addBook(book);
    }

    public void findBook(String string) { // Поиск по catalog
        boolean isFind = false;
        System.out.println("Результат поиска : ");
        System.out.println("* * *");
        for(Book book : catalog.getBooks()){
            if(book.getTitle().equals(string)){
                System.out.println(book.toString());
                isFind = true;
            }else if(book.getAuthor().equals(string)){
                System.out.println(book.toString());
                isFind = true;
            }
        }
        System.out.println(isFind ? "" : "По заданному запросу ничего не найдено");
        System.out.println("* * *");
    }

    public User getUserByRegData(String email, String password){
        for(User user : regData.getUsers()){
            if(user.getEmail().equals(email)){
                if((Coder.decode(user.getPassword())).equals(password)){
                    return user;
                }else{
                    System.out.println("Нет такого пользователья или неправильнно введены логин или пароль");
                }
            }
        }
        return null;
    }


    public void saveCatalog(){ // сериализация catalog  в catalogFile
        try {
            FileOutputStream catalogFileWriter = new FileOutputStream(catalogFileName);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(catalogFileWriter);
            objectOutputStream.writeObject(catalog);
            catalogFileWriter.close();
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveRagData(){ // сериализация regData в regDataFile
        try {
            FileOutputStream regDataFileWriter = new FileOutputStream(regDataFileName);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(regDataFileWriter);
            objectOutputStream.writeObject(regData);
            regDataFileWriter.close();
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
