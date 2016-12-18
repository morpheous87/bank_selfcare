package yourbank.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Mario on 18.12.2016 г..
 */
@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model){
    model.addAttribute("view", "home/index");
    return  "base-layout";
    }

}

