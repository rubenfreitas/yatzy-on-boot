package rf.yatzy.game.core.rules;

import org.junit.Test;
import rf.yatzy.game.core.AbstractIT;
import rf.yatzy.game.core.DiceHashMap;
import rf.yatzy.game.core.config.RuleResult;
import rf.yatzy.game.core.rules.config.Rule;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by rfreitas
 */
public abstract class AbstractRuleTest extends AbstractIT {

    private static final int ZERO_SUM = 0;

    public abstract Rule getRule();

    public abstract DiceHashMap getValidHash();

    public abstract DiceHashMap getNotValidHash();

    @Test
    public void shouldHaveValidCombination(){
        DiceHashMap diceHash = getValidHash();

        RuleResult result = getRule().execute(diceHash);

        assertTrue(result.isValid());
        assertTrue(result.getSum() > ZERO_SUM);
    }

    @Test
    public void shouldNotHaveValidCombination(){
        DiceHashMap diceHash = getNotValidHash();

        RuleResult result = getRule().execute(diceHash);

        assertFalse(result.isValid());
        assertTrue(result.getSum() == ZERO_SUM);
    }


}
