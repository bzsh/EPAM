package by.etc.final_task.task_three;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server implements Runnable{

    private ServerSocket serverSocket;
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;
    private ArrayList<Student> students;

   public Server()throws IOException {
        serverSocket = new ServerSocket(8000);
        students = new ArrayList<>();
    }

    private void addStudent(String name, String surname, int marks) {
        students.add(new Student(students.size() + 1, name, surname, marks));
        System.out.println("Server : студент добавлен в БД");
    }

    private Student getStudent(int id) {
        for (Student student: students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public void run() {
        try {
            clientSocket = serverSocket.accept();
            out = new PrintWriter(clientSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            System.out.println("Server : Сервер запущен");
            String input;
            while ((input = in.readLine()) != null) {
                String[] sequence = input.split(" ");
                if ("stop".equals(sequence[0])) {
                    System.out.println("Server : Соединение остановлено");
                    stop();
                    break;
                } else if (sequence[0].equals("add")){
                    if (sequence.length == 4) {
                        addStudent(sequence[1], sequence[2], Integer.parseInt(sequence[3]));
                        out.println("done");
                    } else {
                        System.out.println("Server : Ошибка при добавлении");
                    }
                } else if (sequence[0].equals("get")) {
                    if (sequence.length == 2) {
                        int id = Integer.parseInt(sequence[1]);
                        Student student = getStudent(id);
                        if (student == null) {
                            System.out.println("Server : Ошибка неверный id");
                        } else {
                            System.out.println("Server : студент передан клиенту");
                            out.println("done " + student);
                        }

                    } else {
                        System.out.println("Server : Wrong instructions to getting");
                    }
                } else if (sequence[0].equals("getAll")) {
                    StringBuilder response = new StringBuilder("done");
                    for (Student student: students) {
                        response.append(" ");
                        response.append(student.getId());
                    }
                    System.out.println("Server : студенты переданы клиенту");
                    out.println(response);
                } else if (sequence[0].equals("edit")) {
                    Student student = getStudent(Integer.parseInt(sequence[1]));
                    if(student != null){
                        student.setName(sequence[2]);
                    student.setSurname(sequence[3]);
                    student.setAverageMark(Integer.parseInt(sequence[4]));
                        System.out.println("Server : студент отредактирован");
                        out.println("done");}
                    else{
                        System.out.println("Server : студенет не найден");
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Server : сервер не запустился");
            e.printStackTrace();
        }
    }


    private void stop() throws IOException {
        in.close();
        out.close();
        clientSocket.close();
        serverSocket.close();
        System.out.println("Server : сервер остановлен");
    }
}
