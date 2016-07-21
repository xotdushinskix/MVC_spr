package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import service.UserService;
import table.User;

import java.sql.SQLException;

/**
 * Created by FromxSoul on 15.07.2016.
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String listUser(Model model) throws SQLException {
        model.addAttribute("listUser", userService.getAllUsers());
        return "users";
    }


    @RequestMapping(value = "/users/edit/{id}", method = RequestMethod.GET)
    public String editUserOpen(@PathVariable("id") int id, Model model) throws SQLException {
        model.addAttribute("user", userService.getUserById(id));
        return "user_edit_page";
    }


    @RequestMapping(value = "/users/edit/{id}", method = RequestMethod.POST)
    public String editUserFinal(@ModelAttribute User user) throws SQLException {
        userService.editUser(user);
        return "redirect:/users";
    }


    @RequestMapping(value = "/users/delete/{id}", method = RequestMethod.POST)
    public String deleteUser(@ModelAttribute User user, @PathVariable int id) throws SQLException {
        userService.deleteUser(id);
        return "redirect:/users";
    }


    @RequestMapping(value = "/users/add", method = RequestMethod.GET)
    public String addUser(@ModelAttribute User user) throws SQLException {
        return "add_user";
    }


    @RequestMapping(value = "/users/add", method = RequestMethod.POST)
    public String deleteUserFinal(@ModelAttribute User user) throws SQLException {
        userService.addUser(user);
        return "redirect:/users";
    }
}
