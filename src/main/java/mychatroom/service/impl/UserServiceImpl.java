package mychatroom.service.impl;

import mychatroom.exception.BussinessException;
import mychatroom.mappers.UserMapper;
import mychatroom.entity.pojo.User;
import mychatroom.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

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
        if (user == null && !user.getPassword().equals(password)) {

            throw new BussinessException("账号或者密码错误");
        }
        return user;
    }

    // TODO 注册
    @Override
    public void register(String username, String password) {
        // 校验用户名是否存在
        User user1 = (User) userMapper.selectByUsername(username);
        if (user1 != null) {
            throw new BussinessException("用户名已存在");
        }
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        // 加入时间和最后活跃时间设置为当前时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDate = sdf.format(new Date());
        user.setJoinTime(formattedDate);
        user.setLastLoginTime(formattedDate);
        userMapper.insert(user);
    }

}