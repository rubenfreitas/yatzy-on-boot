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
public class TwoPair extends AbstractLowerSection implements Rule {

    public RuleResult execute(DiceHash dice) {
        int[] faceOccurrences = countFacesOccurrences(new int[6], dice);

        int pairs = 0;
        int score = 0;
        for (int i = 6; i > 0; i--) {
            if (faceOccurrences[i - 1] >= 2) {
                pairs++;
                score += (i * 2);
            }
        }

        return new RuleResult((pairs == 2) ? TRUE : FALSE, score);
    }

}
