package rf.yatzy.game.core;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import rf.yatzy.game.core.components.DiceHash;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static rf.yatzy.game.core.fixtures.rules.RulesFixtures.testValidFullHouseDiceHash;
import static rf.yatzy.game.core.fixtures.rules.RulesFixtures.testValidTwoPairDiceHash;
import static rf.yatzy.game.core.fixtures.rules.RulesFixtures.testValidYatzyDiceHash;

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

        assertThat(results.getApplicableResultsCount(), equalTo(7));
    }

    @Test
    public void shouldReturnValidResultsGivenYatzyDiceHash() {
        DiceHash diceHash = testValidYatzyDiceHash();

        ApplicableRules results = ruler.run(diceHash);

        assertThat(results.getApplicableResultsCount(), equalTo(6));
    }

    @Test
    public void shouldReturnValidResultsGivenTwoPaiDiceHash() {
        DiceHash diceHash = testValidTwoPairDiceHash();

        ApplicableRules results = ruler.run(diceHash);

        assertThat(results.getApplicableResultsCount(), equalTo(6));
    }
}
