package rf.yatzy.game.core.rules;

import org.mockito.Spy;
import rf.yatzy.game.core.components.DiceHash;
import rf.yatzy.game.core.rules.config.Rule;

import static rf.yatzy.game.core.fixtures.rules.RulesFixtures.testNotValidFivesDiceHash;
import static rf.yatzy.game.core.fixtures.rules.RulesFixtures.testValidFivesDiceHash;
import static rf.yatzy.game.core.fixtures.rules.RulesTestConstants.FIVES_SCORE;

/**
 * Created by rfreitas
 */
public class FivesTest extends AbstractRuleTest {

    @Spy
    private Fives fivesRule;

    @Override
    public Rule getRule() {
        return fivesRule;
    }

    @Override
    public DiceHash getValidHash() {
        return testValidFivesDiceHash();
    }

    @Override
    public DiceHash getNotValidHash() {
        return testNotValidFivesDiceHash();
    }

    @Override
    public int getTotalSum() {
        return FIVES_SCORE;
    }
}
