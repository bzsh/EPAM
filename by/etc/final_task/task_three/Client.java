package by.etc.final_task.task_three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;

public class Client {
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;

    public void start(String ip, int port) throws IOException {
        clientSocket = new Socket(ip, port);
        out = new PrintWriter(clientSocket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        System.out.println("Client : Приложение клиент-сервер запущено");
    }

    public String sendMessage(String msg) throws IOException {
        out.println(msg);
        return in.readLine();
    }

    public void addStudent(String name, String surname, int marks) {
        String response;
        String[] sequence;
        try {
            response = sendMessage("add " + name + " " + surname + " " + marks);
            sequence = response.split(" ");
            if (sequence[0].equals("done")) {
                System.out.println("Client : студент успешно добавлен");
            } else {
                System.out.println("Client : Ошибка при добавлении");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Student> getAll() {
        String response;
        String[] sequence;
        Integer[] studentId;
        try {
            response = sendMessage("getAll");
            sequence = response.split(" ");
            ArrayList<Student> students = new ArrayList<>();
            for (int i = 1; i < sequence.length; i++) {
                Student student = getStudent(Integer.parseInt(sequence[i]));
                if (student != null) {
                    students.add(student);
                }
            }
            return students;

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

    }

    public Student getStudent(int id) {
        String response;
        String[] sequence;
        try {
            response = sendMessage("get " + id);
            sequence = response.split(" ");

            if (sequence[0].equals("done")) {

                return new Student(Integer.parseInt(sequence[1]), sequence[2], sequence[3], Integer.parseInt(sequence[4]));
            } else {
                System.out.println("Client : Ошибка, student не был получен " + sequence[1]);
                return null;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void editStudent(int id, String name, String surname, int score) {
        String response;
        String[] sequence;
        try {
            response = sendMessage("edit " + id + " " + name + " " + surname + " " + score);

            sequence = response.split(" ");
            if (sequence[0].equals("done")) {
                System.out.println("Client : student успешно отредактирован");
            } else {
                System.out.println("Client : Ошибка редактирования student");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void stop() throws IOException {
        System.out.println("Client : приложение Client остановлено");
        System.out.println("Client : останавливаю приложение Server");
        in.close();
        out.close();
        clientSocket.close();
    }
}
