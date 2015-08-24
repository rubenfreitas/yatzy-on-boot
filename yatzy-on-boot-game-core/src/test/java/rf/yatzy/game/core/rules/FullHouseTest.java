package rf.yatzy.game.core.rules;

import org.junit.After;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import rf.yatzy.game.core.AbstractIT;
import rf.yatzy.game.core.components.DiceHash;
import rf.yatzy.game.core.config.RuleResult;

import static java.lang.Boolean.TRUE;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static rf.yatzy.game.core.fixtures.rules.RulesFixtures.testNotValidFullHouseDiceHash;
import static rf.yatzy.game.core.fixtures.rules.RulesFixtures.testValidFullHouseDiceHash;
import static rf.yatzy.game.core.fixtures.rules.RulesTestConstants.FULL_HOUSE_SCORE;

/**
 * Created by rfreitas
 */
public class FullHouseTest extends AbstractIT {

    @Mock
    Pair pairRule;

    @Mock
    ThreeOfAKind threeOfAKindRule;

    @InjectMocks
    FullHouse fullHouseRule;

    @Test
    public void shouldHaveValidFullHouse(){
        DiceHash diceHash = testValidFullHouseDiceHash();
        when(pairRule.execute(diceHash)).thenReturn(new RuleResult(TRUE, 4));
        when(threeOfAKindRule.execute(diceHash)).thenReturn(new RuleResult(TRUE, 18));

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
        verify(pairRule).execute(any(DiceHash.class));
        verify(threeOfAKindRule).execute(any(DiceHash.class));
        verify(fullHouseRule).execute(any(DiceHash.class));
    }

}
