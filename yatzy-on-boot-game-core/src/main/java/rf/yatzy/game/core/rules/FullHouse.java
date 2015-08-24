package rf.yatzy.game.core.rules;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import rf.yatzy.game.core.components.DiceHash;
import rf.yatzy.game.core.config.RuleResult;
import rf.yatzy.game.core.rules.config.Rule;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

/**
 * Created by rfreitas
 */
@Component
public class FullHouse extends AbstractLowerSection implements Rule {

    @Autowired
    private Pair pairRule;

    @Autowired
    private ThreeOfAKind threeOfAKindRule;

    public RuleResult execute(DiceHash dice) {
        int score = 0;
        RuleResult hasPair = pairRule.execute(dice);
        RuleResult hasThreeOfAKind = threeOfAKindRule.execute(dice);
        if(hasPair.isValid() && hasThreeOfAKind.isValid()) {
            score = hasPair.getScore() + hasThreeOfAKind.getScore();
        }

        return new RuleResult((score > 0) ? TRUE : FALSE, score);
    }

}
