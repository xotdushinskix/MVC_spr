package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.UserService;;

import java.sql.SQLException;

/**
 * Created by FromxSoul on 15.07.2016.
 */
@Controller
public class UserController {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }


    @RequestMapping(value = "users", method = RequestMethod.GET)
    public String listUser(Model model) throws SQLException {
        model.addAttribute("listUser", this.userService.getAllUsers());
        return "users";
    }


//    public String editUser(Model model) {
//        model.addAttribute()
//    }
}
