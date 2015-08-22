package rf.yatzy.game.core.rules;

import org.mockito.InjectMocks;
import rf.yatzy.game.core.DiceHashMap;
import rf.yatzy.game.core.rules.config.Rule;

import static rf.yatzy.game.core.fixtures.rules.RulesFixtures.testNotValidTwosDiceHash;
import static rf.yatzy.game.core.fixtures.rules.RulesFixtures.testValidTwosDiceHash;

/**
 * Created by rfreitas
 */
public class TwosTest extends AbstractRuleTest {

    @InjectMocks
    private Twos twosRule;

    @Override
    public Rule getRule() {
        return twosRule;
    }

    @Override
    public DiceHashMap getValidHash() {
        return testValidTwosDiceHash();
    }

    @Override
    public DiceHashMap getNotValidHash() {
        return testNotValidTwosDiceHash();
    }
}
