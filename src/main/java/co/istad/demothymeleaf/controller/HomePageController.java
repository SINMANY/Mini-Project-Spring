package co.istad.demothymeleaf.controller;

import co.istad.demothymeleaf.model.User;
import co.istad.demothymeleaf.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class HomePageController{
        private final UserService userService;
    @GetMapping("/homepage")
        String homepage(Model model) {
        List<User> users = userService.findAllUsers();
        model.addAttribute("users", users);
        return "pages/homepage";
    }
    }