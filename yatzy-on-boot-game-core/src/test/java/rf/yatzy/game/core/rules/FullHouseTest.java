package rf.yatzy.game.core.rules;

import org.junit.After;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import rf.yatzy.game.core.AbstractIT;
import rf.yatzy.game.core.components.DiceHash;
import rf.yatzy.game.core.config.RuleResult;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.verify;
import static rf.yatzy.game.core.fixtures.rules.RulesFixtures.testNotValidFullHouseDiceHash;
import static rf.yatzy.game.core.fixtures.rules.RulesFixtures.testValidFullHouseDiceHash;
import static rf.yatzy.game.core.fixtures.rules.RulesTestConstants.FULL_HOUSE_SCORE;

/**
 * Created by rfreitas
 */
public class FullHouseTest extends AbstractIT {

    @Autowired
    TwoPair twoPairRule;

    @Autowired
    ThreeOfAKind threeOfAKindRule;

    @Autowired
    FullHouse fullHouseRule;

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

    @After
    public void checkCalls(){
        verify(twoPairRule).execute(any(DiceHash.class));
        verify(threeOfAKindRule).execute(any(DiceHash.class));
        verify(fullHouseRule).execute(any(DiceHash.class));
    }

}
