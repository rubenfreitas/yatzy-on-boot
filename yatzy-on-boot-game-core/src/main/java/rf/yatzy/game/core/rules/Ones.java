package rf.yatzy.game.core.rules;

import org.springframework.stereotype.Component;
import rf.yatzy.game.core.DiceHashMap;
import rf.yatzy.game.core.config.RuleResult;
import rf.yatzy.game.core.rules.config.Rule;

import static rf.yatzy.game.core.rules.config.RulesConstants.ONES_VALUE;

/**
 * Created by rfreitas
 */
@Component
public class Ones extends UpperSection implements Rule {

    public RuleResult execute(DiceHashMap dice) {
        return calculateUpper(dice, ONES_VALUE);
    }
}
