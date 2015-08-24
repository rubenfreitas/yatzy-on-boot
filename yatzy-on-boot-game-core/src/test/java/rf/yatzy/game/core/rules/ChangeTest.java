package rf.yatzy.game.core.rules;

import org.junit.After;
import org.junit.Test;
import org.mockito.Spy;
import rf.yatzy.game.core.AbstractIT;
import rf.yatzy.game.core.components.DiceHash;
import rf.yatzy.game.core.config.RuleResult;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.verify;
import static rf.yatzy.game.core.fixtures.rules.RulesFixtures.testChanceDiceHash;
import static rf.yatzy.game.core.fixtures.rules.RulesTestConstants.CHANGE_SCORE;

/**
 * Created by rfreitas
 */
public class ChangeTest extends AbstractIT {

    @Spy
    private Change chanceRule;

    @Test
    public void shouldReturnValidChangeSum(){
        DiceHash diceHash = testChanceDiceHash();

        RuleResult result = chanceRule.execute(diceHash);

        assertTrue(result.isValid());
        assertEquals(result.getScore(), CHANGE_SCORE);
    }

    @After
    public void checkCalls(){
        verify(chanceRule).execute(any(DiceHash.class));
    }
}
