package com.intellipals.service;

import org.springframework.stereotype.Service;
import java.util.*;
import com.intellipals.model.User;
@Service
public class UserService {
    private List<User> users = new ArrayList<>();
    private User user = new User();
    user.setUser

    public void signupUser(User user) {
        users.add(user);
    }
}
