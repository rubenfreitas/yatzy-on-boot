package rf.yatzy.game.core.rules;

import org.mockito.InjectMocks;
import rf.yatzy.game.core.DiceHash;
import rf.yatzy.game.core.rules.config.Rule;

import static rf.yatzy.game.core.fixtures.rules.RulesFixtures.testNotValidFoursDiceHash;
import static rf.yatzy.game.core.fixtures.rules.RulesFixtures.testValidFoursDiceHash;
import static rf.yatzy.game.core.fixtures.rules.RulesTestConstants.FOURS_SCORE;

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
    public DiceHash getValidHash() {
        return testValidFoursDiceHash();
    }

    @Override
    public DiceHash getNotValidHash() {
        return testNotValidFoursDiceHash();
    }

    @Override
    public int getTotalSum() {
        return FOURS_SCORE;
    }
}
