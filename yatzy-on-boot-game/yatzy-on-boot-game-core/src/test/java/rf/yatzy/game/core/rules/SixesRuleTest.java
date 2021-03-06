package rf.yatzy.game.core.rules;

import org.mockito.Spy;
import rf.yatzy.game.core.components.DiceHash;
import rf.yatzy.game.core.rules.config.Rule;

import static rf.yatzy.game.core.fixtures.rules.RulesFixtures.testNotValidSixesDiceHash;
import static rf.yatzy.game.core.fixtures.rules.RulesFixtures.testValidSixesDiceHash;
import static rf.yatzy.game.core.fixtures.rules.RulesTestConstants.SIXES_SCORE;

/**
 * Created by rfreitas
 */
public class SixesRuleTest extends AbstractRuleTest {

    @Spy
    private SixesRule sixesRule;

    @Override
    public Rule getRule() {
        return sixesRule;
    }

    @Override
    public DiceHash getValidHash() {
        return testValidSixesDiceHash();
    }

    @Override
    public DiceHash getNotValidHash() {
        return testNotValidSixesDiceHash();
    }

    @Override
    public int getTotalSum() {
        return SIXES_SCORE;
    }
}
