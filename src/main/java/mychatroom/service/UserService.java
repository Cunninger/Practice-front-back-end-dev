package mychatroom.service;


import mychatroom.entity.pojo.User;

public interface UserService {
    User login(String username, String password);

    void register(String username, String password);

    void updateProfile(String username, String oldPassword, String newPassword);
}
