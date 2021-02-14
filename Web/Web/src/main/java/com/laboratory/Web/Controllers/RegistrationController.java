package com.laboratory.Web.Controllers;

import java.util.Collections;
import java.util.Map;
import com.laboratory.Web.models.User;
import com.laboratory.Web.models.Role;
import com.laboratory.Web.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping ("/registration")
    public String registration()
    {
        return "registration";
    }
    @PostMapping ("/registration") 
    public String addUser(User user, Map<String, Object> model) {
    User UserFromDb;
        UserFromDb = UserRepository.findByUsername(user.getUsername());
        user.setActive(true);
        user.setRoles(Collections.singleton(Role.USER));
        userRepository.save(user);
        return "redirect:/login";
    }
}
