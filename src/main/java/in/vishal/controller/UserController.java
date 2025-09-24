package in.vishal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.vishal.binding.User;
import in.vishal.repository.UserRepository;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepo;

    @GetMapping("/")
    public String loadForm() {
        return "index";
    }

    @PostMapping("/user")
    public String handleSubmitBtn(User user, Model model) {
        userRepo.save(user);
        model.addAttribute("msg", "User saved to DB");
        return "index";
    }
    
    @GetMapping("/users")
    public String showUsers(Model model) {
        List<User> users = userRepo.findAll();
        model.addAttribute("users", users);
        return "users"; // This should match your JSP filename
    }
    
    @GetMapping("/edit")
    public String editUser(@RequestParam("id") Integer id, Model model) {
        User user = userRepo.findById(id).orElse(null);
        model.addAttribute("user", user);
        return "edit"; // JSP page for editing
    }

    @PostMapping("/update")
    public String updateUser(User user) {
        userRepo.save(user); // save() updates if ID exists
        return "redirect:/users";
    }

    @GetMapping("/delete")
    public String deleteUser(@RequestParam("id") Integer id) {
        userRepo.deleteById(id);
        return "redirect:/users";
    }


}
