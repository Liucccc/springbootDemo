package liucccc.springboot.demo.service.impl;
import liucccc.springboot.demo.dao.UserMapper;
import liucccc.springboot.demo.entity.User;
import liucccc.springboot.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * userService
 * @author Liucccc
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User getUser(Long id) {
        return userMapper.getUser(id);
    }

    @Override
    public List<User> getAll() {
        return userMapper.getAll();
    }

    @Override
    public User getUserByName(String name) {
        return userMapper.getUserByName(name);
    }

    @Override
    public User getUser(Long id, String name) {
        return userMapper.getUserByIdAndName(id, name);
    }
}
