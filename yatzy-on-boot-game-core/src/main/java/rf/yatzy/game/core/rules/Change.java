package rf.yatzy.game.core.rules;

import org.springframework.stereotype.Component;
import rf.yatzy.game.core.components.DiceHash;
import rf.yatzy.game.core.components.Die;
import rf.yatzy.game.core.config.RuleResult;
import rf.yatzy.game.core.rules.config.Rule;

import static java.lang.Boolean.TRUE;

/**
 * Created by rfreitas
 */
@Component
public class Change implements Rule {

    public RuleResult execute(DiceHash dice) {
        int sum = 0;
        for (Die die : dice.values()) {
            sum += die.getFaceValue();
        }
        return new RuleResult(TRUE, sum);
    }
}
