package rf.yatzy.game.core.rules;

import org.springframework.stereotype.Component;
import rf.yatzy.game.core.components.DiceHash;
import rf.yatzy.game.core.config.RuleResult;
import rf.yatzy.game.core.rules.config.Rule;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

/**
 * Created by rfreitas
 */
@Component
public class Yatzy extends AbstractLowerSection implements Rule {

    private static final int YATZY_SCORE = 50;

    public RuleResult execute(DiceHash dice) {
        return new RuleResult(hasYatzy(countFacesOccurrences(new int[6], dice)) ? TRUE : FALSE, YATZY_SCORE);
    }

    private boolean hasYatzy(int[] faceOccurrences) {
        for(int die : faceOccurrences) {
            if(die == 5) { return true; }
        }
        return false;
    }
}
