package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import service.UserService;
import table.User;;

import java.sql.SQLException;

/**
 * Created by FromxSoul on 15.07.2016.
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

//    @Autowired
//    public void setUserService(UserService userService) {
//        this.userService = userService;
//    }


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


    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public String editUserFinal(@ModelAttribute User user, int id) throws SQLException {
        User user1 = userService.getUserById(id);
        //@RequestParam("firstName");
        userService.editUser(user1);
        return "redirect:/users";
    }


    @RequestMapping(value = "/users/delete/{id}", method = RequestMethod.POST)
    public String deleteUser(@ModelAttribute User user, @PathVariable int id) throws SQLException {
        userService.deleteUser(id);
        return "redirect:/users";
    }


//    public String editUser(Model model) {
//        model.addAttribute()
//    }
}
