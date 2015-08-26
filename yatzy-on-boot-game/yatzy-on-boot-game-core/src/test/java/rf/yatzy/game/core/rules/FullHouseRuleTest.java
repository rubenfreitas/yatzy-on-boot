package rf.yatzy.game.core.rules;

import org.junit.Test;
import org.mockito.Spy;
import rf.yatzy.game.core.AbstractIT;
import rf.yatzy.game.core.components.DiceHash;
import rf.yatzy.game.core.config.RuleResult;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static rf.yatzy.game.core.fixtures.rules.RulesFixtures.testNotValidFullHouseDiceHash;
import static rf.yatzy.game.core.fixtures.rules.RulesFixtures.testValidFullHouseDiceHash;
import static rf.yatzy.game.core.fixtures.rules.RulesTestConstants.FULL_HOUSE_SCORE;

/**
 * Created by rfreitas
 */
public class FullHouseRuleTest extends AbstractIT {

    @Spy
    FullHouseRule fullHouseRule;

    @Test
    public void shouldHaveValidFullHouse(){
        DiceHash diceHash = testValidFullHouseDiceHash();

        RuleResult result = fullHouseRule.execute(diceHash);

        assertTrue(result.isValid());
        assertEquals(result.getScore(), FULL_HOUSE_SCORE);
    }

    @Test
    public void shouldNotHaveValidFullHouse(){
        DiceHash diceHash = testNotValidFullHouseDiceHash();

        RuleResult result = fullHouseRule.execute(diceHash);

        assertFalse(result.isValid());
    }

}
