package spring.mvc.hiber.security.dao;

import spring.mvc.hiber.security.entity.User;

import java.util.List;

public interface UserDao {

    public List<User> getAllUsers();

}
