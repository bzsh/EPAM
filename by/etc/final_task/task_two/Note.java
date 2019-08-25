package by.etc.final_task.task_two;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Date;

public class Note implements Serializable {
    private String topic;
    private String email;
    private String text;
    private Date date;

    public Note(String topic, String email, String text, Date date) {
        this.topic = topic;
        this.email = email;
        this.text = text;
        this.date = date;
    }

    public String getTopic() {
        return topic;
    }


    public String getEmail() {
        return email;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public static Comparator<Note> topicComparator = new Comparator<Note>() {

        public int compare(Note note1, Note note2) {
            return note1.getTopic().compareTo(note2.getTopic());
        }
    };

    public static Comparator<Note> dateComparator = new Comparator<Note>() {

        public int compare(Note note1, Note note2) {
            return note1.getDate().compareTo(note2.getDate());
        }
    };

    public static Comparator<Note> emailComparator = new Comparator<Note>() {

        public int compare(Note note1, Note note2) {
            return note1.getEmail().compareTo(note2.getEmail());
        }
    };
}
