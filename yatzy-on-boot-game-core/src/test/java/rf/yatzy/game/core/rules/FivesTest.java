package rf.yatzy.game.core.rules;

import org.mockito.InjectMocks;
import rf.yatzy.game.core.DiceHashMap;
import rf.yatzy.game.core.rules.config.Rule;

import static rf.yatzy.game.core.fixtures.rules.RulesFixtures.testNotValidFivesDiceHash;
import static rf.yatzy.game.core.fixtures.rules.RulesFixtures.testValidFivesDiceHash;
import static rf.yatzy.game.core.fixtures.rules.RulesTestConstants.FIVES_SUM;

/**
 * Created by rfreitas
 */
public class FivesTest extends AbstractRuleTest {

    @InjectMocks
    private Fives fivesRule;

    @Override
    public Rule getRule() {
        return fivesRule;
    }

    @Override
    public DiceHashMap getValidHash() {
        return testValidFivesDiceHash();
    }

    @Override
    public DiceHashMap getNotValidHash() {
        return testNotValidFivesDiceHash();
    }

    @Override
    public int getTotalSum() {
        return FIVES_SUM;
    }
}
