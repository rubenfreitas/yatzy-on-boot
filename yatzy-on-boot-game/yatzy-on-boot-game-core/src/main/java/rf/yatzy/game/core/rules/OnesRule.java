package rf.yatzy.game.core.rules;

import rf.yatzy.game.core.components.DiceHash;
import rf.yatzy.game.core.config.RuleResult;
import rf.yatzy.game.core.rules.config.Rule;

import static rf.yatzy.game.core.rules.config.RulesConstants.ONES_VALUE;

/**
 * Created by rfreitas
 */
public class OnesRule extends AbstractUpperSectionRule implements Rule {

    public RuleResult execute(DiceHash dice) {
        return calculateUpper(dice, ONES_VALUE);
    }
}
