package rf.yatzy.game.core;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import rf.yatzy.game.core.components.DiceHash;

import static org.hamcrest.CoreMatchers.equalTo;
import static rf.yatzy.game.core.fixtures.rules.RulesFixtures.testValidFullHouseDiceHash;

/**
 * Created by rfreitas
 */
public class YatzyRulerTest extends AbstractIT {

    @Autowired
    YatzyRuler ruler;

    @Test
    public void shouldReturnValidResultsGivenFullHouseDiceHash() {
        DiceHash diceHash = testValidFullHouseDiceHash();

        ApplicableRules results = ruler.run(diceHash);

        Assert.assertThat(results.getApplicableResultsCount(), equalTo(7));
    }
}
