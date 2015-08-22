package rf.yatzy.game.core.rules;

import rf.yatzy.game.core.DiceHash;
import rf.yatzy.game.core.config.RuleResult;
import rf.yatzy.game.core.rules.config.Rule;

import static rf.yatzy.game.core.rules.config.RulesConstants.SIXES_VALUE;

/**
 * Created by rfreitas
 */
public class Sixes extends AbstractUpperSection implements Rule {

    public RuleResult execute(DiceHash dice) {
        return calculateUpper(dice, SIXES_VALUE);
    }
}
