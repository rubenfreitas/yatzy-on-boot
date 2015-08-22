package rf.yatzy.game.core.rules;

import org.mockito.InjectMocks;
import rf.yatzy.game.core.DiceHashMap;
import rf.yatzy.game.core.rules.config.Rule;

import static rf.yatzy.game.core.fixtures.rules.RulesFixtures.testNotValidSixesDiceHash;
import static rf.yatzy.game.core.fixtures.rules.RulesFixtures.testValidSixesDiceHash;
import static rf.yatzy.game.core.fixtures.rules.RulesTestConstants.SIXES_SUM;

/**
 * Created by rfreitas
 */
public class SixesTest extends AbstractRuleTest {

    @InjectMocks
    private Sixes sixesRule;

    @Override
    public Rule getRule() {
        return sixesRule;
    }

    @Override
    public DiceHashMap getValidHash() {
        return testValidSixesDiceHash();
    }

    @Override
    public DiceHashMap getNotValidHash() {
        return testNotValidSixesDiceHash();
    }

    @Override
    public int getTotalSum() {
        return SIXES_SUM;
    }
}
