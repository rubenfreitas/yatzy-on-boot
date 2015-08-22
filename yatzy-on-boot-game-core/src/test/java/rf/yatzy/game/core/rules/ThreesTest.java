package rf.yatzy.game.core.rules;

import org.mockito.InjectMocks;
import rf.yatzy.game.core.DiceHashMap;
import rf.yatzy.game.core.rules.config.Rule;

import static rf.yatzy.game.core.fixtures.rules.RulesFixtures.testNotValidThreesDiceHash;
import static rf.yatzy.game.core.fixtures.rules.RulesFixtures.testValidThreesDiceHash;

/**
 * Created by rfreitas
 */
public class ThreesTest extends AbstractRuleTest {

    @InjectMocks
    private Threes threesRule;

    @Override
    public Rule getRule() {
        return threesRule;
    }

    @Override
    public DiceHashMap getValidHash() {
        return testValidThreesDiceHash();
    }

    @Override
    public DiceHashMap getNotValidHash() {
        return testNotValidThreesDiceHash();
    }
}
