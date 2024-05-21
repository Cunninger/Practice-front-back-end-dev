package mychatroom.service;


import mychatroom.entity.pojo.User;

public interface UserService {
    User login(String username, String password);

    User register(String username, String password);
}
