package rf.yatzy.game.core.rules;

import org.mockito.InjectMocks;
import rf.yatzy.game.core.DiceHashMap;
import rf.yatzy.game.core.rules.config.Rule;

import static rf.yatzy.game.core.fixtures.rules.RulesFixtures.testNotValidFoursDiceHash;
import static rf.yatzy.game.core.fixtures.rules.RulesFixtures.testValidFoursDiceHash;
import static rf.yatzy.game.core.fixtures.rules.RulesTestConstants.FOURS_SUM;

/**
 * Created by rfreitas
 */
public class FoursTest extends AbstractRuleTest {

    @InjectMocks
    private Fours foursRule;

    @Override
    public Rule getRule() {
        return foursRule;
    }

    @Override
    public DiceHashMap getValidHash() {
        return testValidFoursDiceHash();
    }

    @Override
    public DiceHashMap getNotValidHash() {
        return testNotValidFoursDiceHash();
    }

    @Override
    public int getTotalSum() {
        return FOURS_SUM;
    }
}
