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
import static rf.yatzy.game.core.fixtures.rules.RulesFixtures.testNotValidPairDiceHash;
import static rf.yatzy.game.core.fixtures.rules.RulesFixtures.testValidPairDiceHash;
import static rf.yatzy.game.core.fixtures.rules.RulesTestConstants.PAIR_SCORE;

/**
 * Created by rfreitas
 */
public class PairRuleTest extends AbstractIT {

    @Spy
    private PairRule pairRule;

    @Test
    public void shouldHaveValidPair(){
        DiceHash diceHash = testValidPairDiceHash();

        RuleResult result = pairRule.execute(diceHash);

        assertTrue(result.isValid());
        assertEquals(result.getScore(), PAIR_SCORE);
    }

    @Test
    public void shouldNotHaveValidPair(){
        DiceHash diceHash = testNotValidPairDiceHash();

        RuleResult result = pairRule.execute(diceHash);

        assertFalse(result.isValid());
    }

    @After
    public void checkCalls(){
        verify(pairRule).execute(any(DiceHash.class));
    }
}
