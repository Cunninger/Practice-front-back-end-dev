package mychatroom.service.impl;

import mychatroom.exception.BussinessException;
import mychatroom.mappers.UserMapper;
import mychatroom.entity.pojo.User;
import mychatroom.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 功能：
 * 日期：2024/5/21 上午9:32
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(String username, String password) {
        User user = (User) userMapper.selectByUsername(username);
        if (user == null &&! user.getPassword().equals(password)) {

            throw new BussinessException("账号或者密码错误");
        }
        return user;
    }
    // TODO 注册
    @Override
    public User register(String username, String password) {
        return null;
    }


}