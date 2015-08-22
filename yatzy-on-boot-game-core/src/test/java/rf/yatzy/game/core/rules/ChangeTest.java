package rf.yatzy.game.core.rules;

import org.junit.Test;
import org.mockito.InjectMocks;
import rf.yatzy.game.core.AbstractIT;
import rf.yatzy.game.core.DiceHashMap;
import rf.yatzy.game.core.config.RuleResult;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static rf.yatzy.game.core.fixtures.rules.RulesFixtures.testChanceDiceHash;
import static rf.yatzy.game.core.fixtures.rules.RulesTestConstants.CHANGE_SUM;

/**
 * Created by rfreitas
 */
public class ChangeTest extends AbstractIT {

    @InjectMocks
    private Change chanceRule;

    @Test
    public void shouldReturnValidChangeSum(){
        DiceHashMap diceHash = testChanceDiceHash();

        RuleResult result = chanceRule.execute(diceHash);

        assertTrue(result.isValid());
        assertEquals(result.getSum(), CHANGE_SUM);
    }
}
