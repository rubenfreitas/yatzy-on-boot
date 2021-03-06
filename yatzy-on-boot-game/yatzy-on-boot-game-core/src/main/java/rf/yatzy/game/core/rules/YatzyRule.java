package rf.yatzy.game.core.rules;

import rf.yatzy.game.core.components.DiceHash;
import rf.yatzy.game.core.config.RuleResult;
import rf.yatzy.game.core.rules.config.Rule;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

/**
 * Created by rfreitas
 */
public class YatzyRule extends AbstractLowerSectionRule implements Rule {

    private static final int YATZY_SCORE = 50;

    public RuleResult execute(DiceHash dice) {
        return new RuleResult(hasYatzy(countFacesOccurrences(new Integer[6], dice)) ? TRUE : FALSE, YATZY_SCORE);
    }

    private boolean hasYatzy(Integer[] faceOccurrences) {
        for(int die : faceOccurrences) {
            if(die == 5) { return true; }
        }
        return false;
    }
}
