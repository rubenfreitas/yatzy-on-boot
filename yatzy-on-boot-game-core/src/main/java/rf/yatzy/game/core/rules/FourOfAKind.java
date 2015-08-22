package rf.yatzy.game.core.rules;

import rf.yatzy.game.core.DiceHash;
import rf.yatzy.game.core.config.RuleResult;
import rf.yatzy.game.core.rules.config.Rule;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

/**
 * Created by rfreitas
 */
public class FourOfAKind extends AbstractLowerSection implements Rule {

    public RuleResult execute(DiceHash dice) {
        int[] faceOccurrences = countFacesOccurrences(new int[6], dice);

        int score = 0;
        for (int i = 6; i > 0; i--) {
            if (faceOccurrences[i - 1] >= 4) {
                score = (i * 4);
            }
        }

        return new RuleResult(score == 0 ? FALSE : TRUE, score);
    }

}
