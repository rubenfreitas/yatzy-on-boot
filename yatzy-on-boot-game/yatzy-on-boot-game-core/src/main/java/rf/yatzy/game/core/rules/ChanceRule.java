package rf.yatzy.game.core.rules;

import rf.yatzy.game.core.components.DiceHash;
import rf.yatzy.game.core.components.Die;
import rf.yatzy.game.core.config.RuleResult;
import rf.yatzy.game.core.rules.config.Rule;

import java.util.Collection;

import static java.lang.Boolean.TRUE;

/**
 * Created by rfreitas
 */
public class ChanceRule implements Rule {

    public RuleResult execute(DiceHash dice) {
        return new RuleResult(TRUE, sum(dice.getAllDice()));
    }

    private int sum(Collection<Die> dice) {
        return dice.stream()
                .map(Die::getFaceValue)
                .reduce(0, (sum, faceValue) -> sum + faceValue);
    }
}
