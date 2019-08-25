package by.etc.final_task.task_two;

import java.io.Serializable;
import java.util.ArrayList;

public class Data implements Serializable {
    private ArrayList<Note> notes = new ArrayList<>();

    public void add(Note note){
        notes.add(note);
    }

    public ArrayList<Note> getNotes(){
        return notes;
    }

    public void delNote(Note note){notes.remove(note);}

}
