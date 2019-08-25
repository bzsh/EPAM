package by.etc.final_task.task_one.library.registration_data;

import by.etc.final_task.task_one.user.User;

import java.io.Serializable;
import java.util.ArrayList;

public class RegData implements Serializable {
    private ArrayList<User> users = new ArrayList<User>();

    public ArrayList<User> getUsers() {
        return users;
    }

    public void addUser(User user){
        users.add(user);
    }

    public void delUser(User u){
        users.remove(u);
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }
}
