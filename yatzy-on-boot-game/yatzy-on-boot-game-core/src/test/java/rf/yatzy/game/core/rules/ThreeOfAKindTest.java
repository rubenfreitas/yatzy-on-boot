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
import static rf.yatzy.game.core.fixtures.rules.RulesFixtures.testNotValidThreeOfAKindDiceHash;
import static rf.yatzy.game.core.fixtures.rules.RulesFixtures.testValidThreeOfAKindDiceHash;
import static rf.yatzy.game.core.fixtures.rules.RulesTestConstants.THREE_OF_A_KIND_SCORE;

/**
 * Created by rfreitas
 */
public class ThreeOfAKindTest extends AbstractIT {

    @Spy
    private ThreeOfAKind threeOfAKindRule;

    @Test
    public void shouldHaveValidThreeOfAKind(){
        DiceHash diceHash = testValidThreeOfAKindDiceHash();

        RuleResult result = threeOfAKindRule.execute(diceHash);

        assertTrue(result.isValid());
        assertEquals(result.getScore(), THREE_OF_A_KIND_SCORE);
    }

    @Test
    public void shouldNotHaveValidThreeOfAKind(){
        DiceHash diceHash = testNotValidThreeOfAKindDiceHash();

        RuleResult result = threeOfAKindRule.execute(diceHash);

        assertFalse(result.isValid());
    }

    @After
    public void checkCalls(){
        verify(threeOfAKindRule).execute(any(DiceHash.class));
    }
}
