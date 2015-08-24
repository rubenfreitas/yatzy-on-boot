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
import static rf.yatzy.game.core.fixtures.rules.RulesFixtures.testNotValidSmallStraightDiceHash;
import static rf.yatzy.game.core.fixtures.rules.RulesFixtures.testValidSmallStraightDiceHash;
import static rf.yatzy.game.core.fixtures.rules.RulesTestConstants.SMALL_STRAIGHT_SCORE;

/**
 * Created by rfreitas
 */
public class SmallStraightTest extends AbstractIT {

    @Spy
    SmallStraight smallStraightRule;

    @Test
    public void shouldHaveValidSmallStraight(){
        DiceHash diceHash = testValidSmallStraightDiceHash();

        RuleResult result = smallStraightRule.execute(diceHash);

        assertTrue(result.isValid());
        assertEquals(result.getScore(), SMALL_STRAIGHT_SCORE);
    }

    @Test
    public void shouldNotHaveValidSmallStraight(){
        DiceHash diceHash = testNotValidSmallStraightDiceHash();

        RuleResult result = smallStraightRule.execute(diceHash);

        assertFalse(result.isValid());
    }

    @After
    public void checkCalls(){
        verify(smallStraightRule).execute(any(DiceHash.class));
    }
}
