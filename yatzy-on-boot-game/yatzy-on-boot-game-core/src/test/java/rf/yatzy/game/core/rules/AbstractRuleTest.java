package rf.yatzy.game.core.rules;

import org.junit.Test;
import rf.yatzy.game.core.AbstractIT;
import rf.yatzy.game.core.components.DiceHash;
import rf.yatzy.game.core.config.RuleResult;
import rf.yatzy.game.core.rules.config.Rule;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.verify;

/**
 * Created by rfreitas
 */
public abstract class AbstractRuleTest extends AbstractIT {

    private static final int ZERO_SUM = 0;

    protected abstract Rule getRule();

    protected abstract DiceHash getValidHash();

    protected abstract DiceHash getNotValidHash();

    protected abstract int getTotalSum();

    @Test
    public void shouldHaveValidCombination(){
        DiceHash diceHash = getValidHash();

        RuleResult result = getRule().execute(diceHash);

        assertTrue(result.isValid());
        assertTrue(result.getScore() > ZERO_SUM);
        assertEquals(result.getScore(), getTotalSum());
        verify(getRule()).execute(any(DiceHash.class));
    }

    @Test
    public void shouldNotHaveValidCombination(){
        DiceHash diceHash = getNotValidHash();

        RuleResult result = getRule().execute(diceHash);

        assertFalse(result.isValid());
        assertTrue(result.getScore() == ZERO_SUM);
        verify(getRule()).execute(any(DiceHash.class));
    }


}
