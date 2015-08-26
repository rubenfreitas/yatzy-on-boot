package rf.yatzy.game.core.rules;

import rf.yatzy.game.core.components.DiceHash;
import rf.yatzy.game.core.config.RuleResult;
import rf.yatzy.game.core.rules.config.Rule;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

/**
 * Created by rfreitas
 */
public class FullHouseRule extends AbstractLowerSectionRule implements Rule {

    private PairRule pairRule;
    private ThreeOfAKindRule threeOfAKindRule;

    private RuleResult pairResult;
    private RuleResult threeOfAKindResult;

    public FullHouseRule(){
        this.pairRule = new PairRule();
        this.threeOfAKindRule = new ThreeOfAKindRule();
    }

    public RuleResult execute(DiceHash dice) {
        int score = 0;
        if(isFullHouse(dice)     ) {
            score = pairResult.getScore() + threeOfAKindResult.getScore();
        }
        return new RuleResult((score > 0) ? TRUE : FALSE, score);
    }

    private boolean isFullHouse(DiceHash dice) {
        pairResult = pairRule.execute(dice);
        threeOfAKindResult = threeOfAKindRule.execute(dice);
        return isFullHouse();
    }

    private boolean isFullHouse() {
        return pairResult.isValid() && threeOfAKindResult.isValid() && (pairResult.getScore() / 2) != (threeOfAKindResult.getScore() / 3);
    }

}
