package rf.yatzy.game.core.rules;

import org.springframework.stereotype.Component;
import rf.yatzy.game.core.components.DiceHash;
import rf.yatzy.game.core.config.RuleResult;
import rf.yatzy.game.core.rules.config.Rule;

import static rf.yatzy.game.core.rules.config.RulesConstants.TWOS_VALUE;

/**
 * Created by rfreitas
 */
public class TwosRule extends AbstractUpperSectionRule implements Rule {

    public RuleResult execute(DiceHash dice) {
        return calculateUpper(dice, TWOS_VALUE);
    }
}
