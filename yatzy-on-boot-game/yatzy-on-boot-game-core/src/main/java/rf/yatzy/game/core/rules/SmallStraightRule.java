package rf.yatzy.game.core.rules;

import rf.yatzy.game.core.components.DiceHash;
import rf.yatzy.game.core.config.RuleResult;
import rf.yatzy.game.core.rules.config.Rule;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

/**
 * Created by rfreitas
 */
public class SmallStraightRule extends AbstractLowerSectionRule implements Rule {

    private static final int SMALL_STRAIGHT_SCORE = 15;

    public RuleResult execute(DiceHash dice) {
        return new RuleResult(hasSmallStraight(countFacesOccurrences(new int[6], dice)) ? TRUE : FALSE, SMALL_STRAIGHT_SCORE);
    }

    private boolean hasSmallStraight(int[] faceOccurrences) {
        return faceOccurrences[0] == 1 && faceOccurrences[1] == 1 && faceOccurrences[2] == 1 && faceOccurrences[3] == 1 && faceOccurrences[4] == 1;
    }

}
