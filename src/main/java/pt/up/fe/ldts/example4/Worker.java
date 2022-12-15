package pt.up.fe.ldts.example4;

import java.util.Objects;

public class Worker extends Human {
    private final String username;
    private final String password;

    public Worker(String name, String phoneNumber, String username, String password) {
        super(name,phoneNumber);
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    public boolean login(String username, String password) {
        return getUsername().equals(username) && getPassword().equals(password);
    }
}
