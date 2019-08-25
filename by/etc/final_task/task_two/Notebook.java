package by.etc.final_task.task_two;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Notebook {
    private String fileName = "src\\main\\java\\by\\etc\\final_task\\task_two\\note.dta";
    private Data data = new Data();
    private boolean ready;
    private ArrayList<Note> selectedNotes;

    public Notebook() {

        FileInputStream fis;

        try {
            fis = new FileInputStream(fileName);
            ObjectInputStream objectInputStream = new ObjectInputStream(fis);
            Object o = objectInputStream.readObject();

            if (o != null) {
                data = (Data) o;
                ready = true;
            } else {
                ready = false;
            }

            fis.close();
            objectInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public boolean isReady() {
        return ready;
    }

    public void addNote(String topic, String email, String text, Date date) {
        data.add(new Note(topic, email, text, date));
    }

    public String delNote(String name) {
        for (Note note : data.getNotes()) {
            if (note.getTopic().equals(name)) {
                data.delNote(note);
                return "Заметка с названием темы \"" + name + "\" успешно удалена !";
            }
        }
        return "Заметки с названием темы \"" + name + "\" не найдено !";
    }

    public boolean checkEmail(String email) {
        Pattern pattern = Pattern.compile("^([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        return matcher.find();
    }

    public void saveData() {
        try {
            FileOutputStream noteFileWriter = new FileOutputStream(fileName);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(noteFileWriter);
            objectOutputStream.writeObject(data);
            noteFileWriter.close();
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printNotes() {
        SimpleDateFormat sdf = new SimpleDateFormat("d MMM yyyy HH:mm:ss");
        for (Note n : data.getNotes()) {
            System.out.println();
            System.out.println("****************************************************************");
            System.out.println("Тема : " + n.getTopic());
            System.out.println("Email : " + n.getEmail());
            System.out.println("Дата создания : " + sdf.format(n.getDate()));
            System.out.println("Текст заметки : " + n.getText());
            System.out.println("****************************************************************");
        }
    }

    public String findNote(String string) {
        SimpleDateFormat sdf = new SimpleDateFormat("d MMM yyyy");
        selectedNotes = new ArrayList<>();
        if (!string.equals("")) {
            for (Note n : data.getNotes()) {
                if (n.getTopic().contains(string)) {
                    selectedNotes.add(n);
                    System.out.println("Есть совпадение в названии темы заметки\n");
                }

                if (n.getEmail().contains(string)) {
                    selectedNotes.add(n);
                    System.out.println("Есть совпадение в Email адресе заметок\n");
                }

                if (sdf.format(n.getDate()).contains(string)) {
                    selectedNotes.add(n);
                    System.out.println("Есть совпадение по дате создания заметки\n");
                }
            }
        }
        return "По вашему запросу ничего не найдено";
    }

    public void sortNotes(String string) {
        if (selectedNotes != null) {
            switch (string) {
                case ("email"):
                    Collections.sort(selectedNotes, Note.emailComparator);
                    break;
                case ("topic"):
                    Collections.sort(selectedNotes, Note.topicComparator);
                    break;
                case ("date"):
                    Collections.sort(selectedNotes, Note.dateComparator);
                    break;
            }
        }
    }

    public void printSelectedNotes() {
        SimpleDateFormat sdf = new SimpleDateFormat("d MMM yyyy HH:mm:ss");
        if (selectedNotes.size() > 0) {
            for (Note n : selectedNotes) {
                System.out.println();
                System.out.println("****************************************************************");
                System.out.println("Тема : " + n.getTopic());
                System.out.println("Email : " + n.getEmail());
                System.out.println("Дата создания : " + sdf.format(n.getDate()));
                System.out.println("Текст заметки : " + n.getText());
                System.out.println("****************************************************************");
            }
        } else {
            System.out.println("Список результатов поиска пуст");
        }
    }
}
