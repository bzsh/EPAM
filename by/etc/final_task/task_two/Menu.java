package by.etc.final_task.task_two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

public class Menu {
    private boolean isExit = false;
    private Notebook notebook;
    private BufferedReader reader;

    public Menu() {
        notebook = new Notebook();
        reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Добро пожаловать в приложение Блокнот !  ");
        System.out.println();
        startMenu(notebook.isReady());
    }

    private void startMenu(boolean ready) {
         //boolean flag = ready;
        isExit = false;
        String result = "";

        while (!isExit) {
            if (ready) {
                System.out.println("**************************************************");
                System.out.println("*                 Главное меню                   *");
                System.out.println("*   - Для добавления новой заметки введите add   *");
                System.out.println("*   - Для удаления заметки введите del           *");
                System.out.println("*   - Для вывода заметок на экран введите print  *");
                System.out.println("*   - Для поиска заметки введите find            *");
                System.out.println("*   - Для выхода из приложения введите exit      *");
                System.out.println("*                                                *");
                System.out.println("**************************************************");
                try {
                    result = reader.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                switch (result) {
                    case ("add"):
                        add();
                        break;
                    case ("del"):
                        del();
                        break;
                    case ("print"):
                        print();
                        break;
                    case ("find"):
                        find();
                        break;
                    case ("exit"):
                        exit();
                        return;
                    default:
                        System.out.println("Введите корректный запрос");
                        break;
                }
            } else {
                System.out.println("**************************************************");
                System.out.println("*   Блокнот пуст, добавте заметку!               *");
                System.out.println("*                                                *");
                System.out.println("*   - Для создания заметки введите add           *");
                System.out.println("*   - Для выхода из приложения введите exit      *");
                System.out.println("*                                                *");
                System.out.println("**************************************************");
                while (!ready) {
                    try {
                        result = reader.readLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    switch (result) {
                        case ("add"):
                            add();
                            ready = true;
                            continue;
                        case ("exit"):
                            exit();
                            return;
                        default:
                            System.out.println("Введите корректный запрос");
                            break;
                    }
                }
            }
        }
    }

    private void add() {
        String text;
        String topic = "";
        String email = "";

        Date date = new Date();

        boolean b = true;
        System.out.println("*** Форма данных новой заметки ***");
        System.out.println();
        System.out.print("Тема заметки : ");
        try {
            topic = reader.readLine();
            System.out.println("   (принято)");
        } catch (IOException e) {
            e.printStackTrace();
        }
        while (b) {
            System.out.print("Email :");
            try {
                email = reader.readLine();
                if (notebook.checkEmail(email)) {
                    System.out.println("   (емейл адрес принят)");
                    b = false;
                    break;
                } else {
                    System.out.println("   (отклонено)");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Введите корректный Email адрес");
        }
        System.out.println("Наберите текст заметки");
        try {
            text = reader.readLine();
            notebook.addNote(topic, email, text, date);
            System.out.println("Заетка успешно создана !");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void del() {
        System.out.println("Введите название темы заметки которую необходимо удалить");
        String topic = "";
        try{topic = reader.readLine();}catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(notebook.delNote(topic));
    }

    private void print() {
        notebook.printNotes();
        System.out.println("Нажмите клавишу Enter для возврата в главное меню");
        try {
            reader.readLine();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private void sort() {
        String str = "";

        while (true) {
            System.out.println("Введите критерий сортировки заметок !");
            System.out.println("email - для сортировки по email адресам");
            System.out.println("topic - для сортировки по темам заметок");
            System.out.println("date - для сортировки по дате создания заметок");
            System.out.println("Введите main для перехода в главное меню");
            try {
                str = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            switch (str) {
                case ("email"):
                    notebook.sortNotes(str);
                    break;
                case ("topic"):
                    notebook.sortNotes(str);
                    break;
                case ("date"):
                    notebook.sortNotes(str);
                    break;
                case ("menu"):
                    return;
                default:
                    System.out.println("Введите корректный запрос");
                    break;
            }
        }
    }

    private void find() {

        String str = "";
        while (true) {
            System.out.println("Введите текст который вы хотели бы найти в заметках");
            try {
                str = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(notebook.findNote(str));
            System.out.println();
            System.out.println("Введите topic, email или date для сортировки результата поиска");
            System.out.println("Введите main для перехода в главное меню");
            System.out.println("Введите find что бы продолжить поиск");
            System.out.println("Введите print что бы вывести результват на экран");
            try{
            str = reader.readLine();
            }catch(IOException e){
                e.printStackTrace();
            }
            switch (str) {
                case ("email"):
                    notebook.sortNotes(str);
                    break;
                case ("topic"):
                    notebook.sortNotes(str);
                    break;
                case ("date"):
                    notebook.sortNotes(str);
                    break;
                case ("find"):
                    break;
                case ("print"):
                    notebook.printSelectedNotes();
                    break;
                case ("menu"):
                    return;
                default:
                    System.out.println("Введите корректный запрос");
                    break;
            }
        }
    }

    private void exit() {
        notebook.saveData();
        System.out.println("Всего доброго !");
    }
}
