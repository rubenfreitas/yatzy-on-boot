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
public class LargeStraightRule extends AbstractLowerSectionRule implements Rule {

    private static final int LARGE_STRAIGHT_SCORE = 20;

    public RuleResult execute(DiceHash dice) {
        return new RuleResult(hasSmallStraight(countFacesOccurrences(new int[6], dice)) ? TRUE : FALSE, LARGE_STRAIGHT_SCORE);
    }

    private boolean hasSmallStraight(int[] faceOccurrences) {
        return faceOccurrences[1] == 1 && faceOccurrences[2] == 1 && faceOccurrences[3] == 1 && faceOccurrences[4] == 1 && faceOccurrences[5] == 1;
    }

}
