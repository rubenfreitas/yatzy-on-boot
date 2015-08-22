package rf.yatzy.game.core.rules;

import rf.yatzy.game.core.DiceHash;
import rf.yatzy.game.core.config.RuleResult;
import rf.yatzy.game.core.rules.config.Rule;

import static rf.yatzy.game.core.rules.config.RulesConstants.ONES_VALUE;

/**
 * Created by rfreitas
 */
public class Ones extends AbstractUpperSection implements Rule {

    public RuleResult execute(DiceHash dice) {
        return calculateUpper(dice, ONES_VALUE);
    }
}
