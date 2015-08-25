package rf.yatzy.game.core.rules;

import rf.yatzy.game.core.components.Die;
import rf.yatzy.game.core.config.RuleResult;

import java.util.HashMap;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

/**
 * Created by rfreitas
 */
abstract class AbstractUpperSection {

    protected static RuleResult calculateUpper(HashMap<Integer, Die> dice, int value){
        int sum = 0;
        for (Die die : dice.values()) {
            if (die.getFaceValue() == value) { sum += value; }
        }
        return createResult(sum == 0 ? FALSE : TRUE, sum);
    }

    private static RuleResult createResult(Boolean isValid, int sum) {
        return new RuleResult(isValid, sum);
    }
}
