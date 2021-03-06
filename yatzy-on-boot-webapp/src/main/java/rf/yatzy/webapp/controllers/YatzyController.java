package rf.yatzy.webapp.controllers;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import rf.yatzy.game.api.score.YatzyScoreBoard;
import rf.yatzy.game.api.score.YatzyTypes;

import static java.util.EnumSet.allOf;

/**
 * Created by rfreitas
 */
@Controller
@EnableAutoConfiguration
public class YatzyController {

    private YatzyScoreBoard scoreBoard = new YatzyScoreBoard(allOf(YatzyTypes.class));

    @RequestMapping("/")
    String home() {
        return "index";
    }


    @ModelAttribute("scores")
    public YatzyScoreBoard messages() {
        return scoreBoard;
    }

}