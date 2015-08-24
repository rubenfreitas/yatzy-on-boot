package rf.yatzy.webapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import rf.yatzy.game.integration.YatzyService;
import rf.yatzy.game.integration.score.YatzyScoreBoard;
import rf.yatzy.game.integration.score.YatzyTypes;

import static java.util.EnumSet.allOf;

@Controller
@EnableAutoConfiguration
public class YatzyController {

    @Autowired
    YatzyService service;

    YatzyScoreBoard scoreBoard = new YatzyScoreBoard(allOf(YatzyTypes.class));

    @RequestMapping("/")
    String home() {
        return "index";
    }

}