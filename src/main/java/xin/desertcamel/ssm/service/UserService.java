package xin.desertcamel.ssm.service;

import java.util.List;

import xin.desertcamel.ssm.bean.User;

/**
 * UserService
 */

 //notice
public interface UserService {

    void insertUser(User user);

    void deleteUser(int id);

    User findUserById(Integer id);

    List<User> findAllUsers();

    void updateUser(User user); 
}