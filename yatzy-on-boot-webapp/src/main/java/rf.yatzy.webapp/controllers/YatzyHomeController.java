package rf.yatzy.webapp.controllers;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@EnableAutoConfiguration
public class YatzyHomeController {

    @RequestMapping("/")
    String home() {
        return "index";
    }

}