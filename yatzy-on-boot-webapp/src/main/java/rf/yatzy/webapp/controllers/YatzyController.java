package rf.yatzy.webapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import rf.yatzy.game.service.YatzyService;

@Controller
@EnableAutoConfiguration
public class YatzyController {

    @Autowired
    YatzyService service;

    @RequestMapping("/")
    String home() {
        return "index";
    }

}