package Inventarymanagement;

import java.util.HashMap;
import java.util.Map;

public class UserAuthentication {
    private Map<String, String> users;

    public UserAuthentication() {
        users = new HashMap<>();
        // Predefined users
        users.put("admin", "password");
    }

    public boolean authenticate(String username, String password) {
        return users.containsKey(username) && users.get(username).equals(password);
    }
}

