package rf.yatzy.game.core.rules;

import rf.yatzy.game.core.components.DiceHash;
import rf.yatzy.game.core.components.Die;
import rf.yatzy.game.core.config.RuleResult;
import rf.yatzy.game.core.rules.config.Rule;

import static java.lang.Boolean.TRUE;

/**
 * Created by rfreitas
 */
public class ChanceRule implements Rule {

    public RuleResult execute(DiceHash dice) {
        int sum = 0;
        for (Die die : dice.getAllDice()) {
            sum += die.getFaceValue();
        }
        return new RuleResult(TRUE, sum);
    }
}
