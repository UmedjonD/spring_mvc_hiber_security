package spring.mvc.hiber.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.mvc.hiber.security.dao.UserDao;
import spring.mvc.hiber.security.entity.User;

import java.util.List;

@Controller
public class UserController {

    private UserDao userDao;

    @Autowired
    public UserController(UserDao userDao) {
        this.userDao = userDao;
    }

    @RequestMapping("/")
    public String showAllUsers(Model model) {
        List<User> allUsers = userDao.getAllUsers();
        model.addAttribute("allUs", allUsers);
        return "all-users";
    }

}
