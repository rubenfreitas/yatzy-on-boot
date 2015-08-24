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
import static rf.yatzy.game.core.fixtures.rules.RulesFixtures.testNotValidLargeStraightDiceHash;
import static rf.yatzy.game.core.fixtures.rules.RulesFixtures.testValidLargeStraightDiceHash;
import static rf.yatzy.game.core.fixtures.rules.RulesTestConstants.LARGE_STRAIGHT_SCORE;

/**
 * Created by rfreitas
 */
public class LargeStraightTest extends AbstractIT {

    @Spy
    LargeStraight largeStraightRule;

    @Test
    public void shouldHaveValidLargeStraight(){
        DiceHash diceHash = testValidLargeStraightDiceHash();

        RuleResult result = largeStraightRule.execute(diceHash);

        assertTrue(result.isValid());
        assertEquals(result.getScore(), LARGE_STRAIGHT_SCORE);
    }

    @Test
    public void shouldNotHaveValidLargeStraight(){
        DiceHash diceHash = testNotValidLargeStraightDiceHash();

        RuleResult result = largeStraightRule.execute(diceHash);

        assertFalse(result.isValid());
    }

    @After
    public void checkCalls(){
        verify(largeStraightRule).execute(any(DiceHash.class));
    }
}
