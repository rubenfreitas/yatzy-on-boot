package rf.yatzy.game.core.rules;

import rf.yatzy.game.core.DiceHashMap;
import rf.yatzy.game.core.Die;
import rf.yatzy.game.core.config.RuleResult;
import rf.yatzy.game.core.rules.config.Rule;

import static java.lang.Boolean.TRUE;

/**
 * Created by rfreitas
 */
public class Change implements Rule {

    public RuleResult execute(DiceHashMap dice) {
        return calculateChange(dice);
    }

    private RuleResult calculateChange(DiceHashMap dice) {
        int sum = 0;
        for (Die die : dice.values()) {
            sum += die.getFaceValue();
        }
        return new RuleResult(TRUE, sum);
    }
}
