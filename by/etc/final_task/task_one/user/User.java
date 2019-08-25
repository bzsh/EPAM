package by.etc.final_task.task_one.user;

import by.etc.final_task.task_one.user.coder.Coder;

import java.io.Serializable;

public class User implements Serializable {
    private String email;
    private String password;
    private String role;

    public User(String email, String password, String role) {
        this.email = email;
        this.password = Coder.encode(password);
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
