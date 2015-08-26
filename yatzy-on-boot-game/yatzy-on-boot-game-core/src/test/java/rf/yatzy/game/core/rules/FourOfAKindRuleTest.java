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
import static rf.yatzy.game.core.fixtures.rules.RulesFixtures.testNotValidFourOfAKindDiceHash;
import static rf.yatzy.game.core.fixtures.rules.RulesFixtures.testValidFourOfAKindDiceHash;
import static rf.yatzy.game.core.fixtures.rules.RulesTestConstants.FOUR_OF_A_KIND_SCORE;

/**
 * Created by rfreitas
 */
public class FourOfAKindRuleTest extends AbstractIT {

    @Spy
    private FourOfAKindRule fourOfAKindRule;

    @Test
    public void shouldHaveValidThreeOfAKind(){
        DiceHash diceHash = testValidFourOfAKindDiceHash();

        RuleResult result = fourOfAKindRule.execute(diceHash);

        assertTrue(result.isValid());
        assertEquals(result.getScore(), FOUR_OF_A_KIND_SCORE);
    }

    @Test
    public void shouldNotHaveValidThreeOfAKind(){
        DiceHash diceHash = testNotValidFourOfAKindDiceHash();

        RuleResult result = fourOfAKindRule.execute(diceHash);

        assertFalse(result.isValid());
    }

    @After
    public void checkCalls(){
        verify(fourOfAKindRule).execute(any(DiceHash.class));
    }
}
