package rf.yatzy.game.core.rules;

import org.junit.After;
import org.junit.Test;
import org.mockito.Spy;
import rf.yatzy.game.core.AbstractIT;
import rf.yatzy.game.core.components.DiceHash;
import rf.yatzy.game.core.config.RuleResult;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.verify;
import static rf.yatzy.game.core.fixtures.rules.RulesFixtures.testNotValidYatzyDiceHash;
import static rf.yatzy.game.core.fixtures.rules.RulesFixtures.testValidYatzyDiceHash;
import static rf.yatzy.game.core.fixtures.rules.RulesTestConstants.YATZY_SCORE;

/**
 * Created by rfreitas
 */
public class YatzyRuleTest extends AbstractIT {

    @Spy
    private YatzyRule yatzyRule;

    @Test
    public void shouldHaveValidYatzy(){
        DiceHash diceHash = testValidYatzyDiceHash();

        RuleResult result = yatzyRule.execute(diceHash);

        assertTrue(result.isValid());
        assertEquals(result.getScore(), YATZY_SCORE);
    }

    @Test
    public void shouldNotHaveValidYatzy(){
        DiceHash diceHash = testNotValidYatzyDiceHash();

        RuleResult result = yatzyRule.execute(diceHash);

        assertFalse(result.isValid());
    }
    @After
    public void checkCalls(){
        verify(yatzyRule).execute(any(DiceHash.class));
    }

}
