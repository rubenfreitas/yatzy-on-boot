package rf.yatzy.game.core.rules;

import org.junit.Test;
import org.mockito.InjectMocks;
import rf.yatzy.game.core.AbstractIT;
import rf.yatzy.game.core.DiceHash;
import rf.yatzy.game.core.config.RuleResult;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static rf.yatzy.game.core.fixtures.rules.RulesFixtures.testNotValidYatzyDiceHash;
import static rf.yatzy.game.core.fixtures.rules.RulesFixtures.testValidYatzyDiceHash;
import static rf.yatzy.game.core.fixtures.rules.RulesTestConstants.YATZY_SCORE;

/**
 * Created by rfreitas
 */
public class YatzyTest extends AbstractIT {

    @InjectMocks
    private Yatzy yatzyRule;

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
}
