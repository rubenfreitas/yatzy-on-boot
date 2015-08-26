package rf.yatzy.game.core.rules;

import org.mockito.Spy;
import rf.yatzy.game.core.components.DiceHash;
import rf.yatzy.game.core.rules.config.Rule;

import static rf.yatzy.game.core.fixtures.rules.RulesFixtures.testNotValidOnesDiceHash;
import static rf.yatzy.game.core.fixtures.rules.RulesFixtures.testValidOnesDiceHash;
import static rf.yatzy.game.core.fixtures.rules.RulesTestConstants.ONES_SCORE;

/**
 * Created by rfreitas
 */
public class OnesRuleTest extends AbstractRuleTest {

    @Spy
    private OnesRule onesRule;

    @Override
    public Rule getRule() {
        return onesRule;
    }

    @Override
    public DiceHash getValidHash() {
        return testValidOnesDiceHash();
    }

    @Override
    public DiceHash getNotValidHash() {
        return testNotValidOnesDiceHash();
    }

    @Override
    public int getTotalSum() {
        return ONES_SCORE;
    }

}
