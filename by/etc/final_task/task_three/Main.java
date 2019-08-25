package by.etc.final_task.task_three;

/*
Задание 3: создайте клиент-серверное приложение “Архив”.
Общие требования к заданию:
• В архиве хранятся Дела (например, студентов). Архив находится на сервере.
• Клиент, в зависимости от прав, может запросить дело на просмотр, внести в
него изменения, или создать новое дело.
Требования к коду лабораторной работы:
• Для реализации сетевого соединения используйте сокеты.
• Формат хранения данных на сервере – xml-файлы.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str;
        try {

           Server server = new Server();
           Thread thread = new Thread(server);
           thread.start();
           System.out.println("Main : Запуск сервера");
           try{Thread.sleep(500);}catch(InterruptedException e){e.printStackTrace();}
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Main : Сервер не запустился");
            System.exit(0);
        }
        Client client = new Client();
        try {
            System.out.println("Main : Запускаю приложение клиент-сервер");
            client.start("127.0.0.1", 8000);
        } catch (IOException e) {
            System.out.println("Main : Ошибка при запуске приложения клиент-сервер");
            e.printStackTrace();
            System.exit(0);
        }

        while (true) {
            System.out.println("Введите add что бы добавить студента");
            System.out.println("Введите print что бы вывести всех студентов на экран");
            System.out.println("Введите edit для редактироваться");
            System.out.println("Введите exit для выхода из программы");

            str = reader.readLine();

            if (str.equals("add")) {

                System.out.println("Введите имя студента");
                String name = reader.readLine();
                System.out.println("Введите фамилию студента");
                String surname = reader.readLine();
                System.out.println("Введите средний балл студента");
                int mark = Integer.parseInt(reader.readLine());
                client.addStudent(name, surname, mark);

            } else if (str.equals("print")) {
                ArrayList<Student> students = client.getAll();

                for (Student student: students) {
                    print(student);
                }

            } else if (str.equals("edit")) {
                System.out.println("Введите id студента");
                int id = Integer.parseInt(reader.readLine());
                Student student = client.getStudent(id);

                System.out.println();
                if (student != null) {
                    print(student);

                    System.out.println("Введите имя студента");
                    String newName = reader.readLine();
                    System.out.println("Введите фамилию студента");
                    String newSurname = reader.readLine();
                    System.out.println("Введите средний балл студента");
                    int newMark = Integer.parseInt(reader.readLine());
                    client.editStudent(student.getId(), newName, newSurname, newMark);
                    Student newStudent = client.getStudent(id);
                    print(newStudent);
                } else {
                    System.out.println("Main : Студент не найден");
                }
                
            } else if (str.equals("exit")) {
                try {
                    System.out.println("Main : Останавливаю приложение Client");
                    client.sendMessage("stop");
                    client.stop();


                } catch (Exception e) {
                    System.out.println("Main : Ошибка при остановке приложения Client");
                    e.printStackTrace();
                }
                return;
            }
        }
    }private static void print(Student student) {
        System.out.println();
        System.out.println(student.toString());
        System.out.println();
    }
}
