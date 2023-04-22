package co.istad.demothymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class FilterPageController {
    @GetMapping("/filterpage")
    String filterPage(){
        return "pages/filterpage";
    }
}
