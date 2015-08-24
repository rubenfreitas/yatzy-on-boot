package rf.yatzy.game.core.rules;

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
import static rf.yatzy.game.core.fixtures.rules.RulesFixtures.testNotValidTwoPairDiceHash;
import static rf.yatzy.game.core.fixtures.rules.RulesFixtures.testValidTwoPairDiceHash;
import static rf.yatzy.game.core.fixtures.rules.RulesTestConstants.TWO_PAIR_SCORE;

/**
 * Created by rfreitas
 */
public class TwoPairTest extends AbstractIT {

    @Spy
    private TwoPair twoPairRule;

    @Test
    public void shouldHaveValidTwoPair(){
        DiceHash diceHash = testValidTwoPairDiceHash();

        RuleResult result = twoPairRule.execute(diceHash);

        verify(twoPairRule).execute(any(DiceHash.class));
        assertTrue(result.isValid());
        assertEquals(result.getScore(), TWO_PAIR_SCORE);

    }

    @Test
    public void shouldNotHaveValidTwoPair(){
        DiceHash diceHash = testNotValidTwoPairDiceHash();

        RuleResult result = twoPairRule.execute(diceHash);

        verify(twoPairRule).execute(any(DiceHash.class));
        assertFalse(result.isValid());
    }
}
