package liucccc.springboot.demo.service;


import liucccc.springboot.demo.entity.User;

import java.util.List;

public interface UserService {
    User getUser(Long id);

    List<User> getAll();

    User getUserByName(String name);

    User getUser(Long id, String name);
}
