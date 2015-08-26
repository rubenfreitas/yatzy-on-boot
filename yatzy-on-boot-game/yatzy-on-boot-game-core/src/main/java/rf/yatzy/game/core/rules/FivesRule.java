package rf.yatzy.game.core.rules;

import rf.yatzy.game.core.components.DiceHash;
import rf.yatzy.game.core.config.RuleResult;
import rf.yatzy.game.core.rules.config.Rule;

import static rf.yatzy.game.core.rules.config.RulesConstants.FIVES_VALUE;

/**
 * Created by rfreitas
 */
public class FivesRule extends AbstractUpperSectionRule implements Rule {

    public RuleResult execute(DiceHash dice) {
        return calculateUpper(dice, FIVES_VALUE);
    }
}
