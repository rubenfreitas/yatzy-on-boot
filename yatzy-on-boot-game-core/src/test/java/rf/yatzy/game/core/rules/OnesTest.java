package rf.yatzy.game.core.rules;

import org.mockito.InjectMocks;
import rf.yatzy.game.core.DiceHashMap;
import rf.yatzy.game.core.rules.config.Rule;

import static rf.yatzy.game.core.fixtures.rules.RulesFixtures.testNotValidOnesDiceHash;
import static rf.yatzy.game.core.fixtures.rules.RulesFixtures.testValidOnesDiceHash;
import static rf.yatzy.game.core.fixtures.rules.RulesTestConstants.ONES_SUM;

/**
 * Created by rfreitas
 */
public class OnesTest extends AbstractRuleTest {

    @InjectMocks
    private Ones onesRule;

    @Override
    public Rule getRule() {
        return onesRule;
    }

    @Override
    public DiceHashMap getValidHash() {
        return testValidOnesDiceHash();
    }

    @Override
    public DiceHashMap getNotValidHash() {
        return testNotValidOnesDiceHash();
    }

    @Override
    public int getTotalSum() {
        return ONES_SUM;
    }

}
