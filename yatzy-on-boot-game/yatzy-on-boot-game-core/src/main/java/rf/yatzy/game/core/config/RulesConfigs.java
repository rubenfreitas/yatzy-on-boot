package rf.yatzy.game.core.config;

import rf.yatzy.game.core.rules.ChanceRule;
import rf.yatzy.game.core.rules.FivesRule;
import rf.yatzy.game.core.rules.FourOfAKindRule;
import rf.yatzy.game.core.rules.FoursRule;
import rf.yatzy.game.core.rules.FullHouseRule;
import rf.yatzy.game.core.rules.LargeStraightRule;
import rf.yatzy.game.core.rules.OnesRule;
import rf.yatzy.game.core.rules.PairRule;
import rf.yatzy.game.core.rules.SixesRule;
import rf.yatzy.game.core.rules.SmallStraightRule;
import rf.yatzy.game.core.rules.ThreeOfAKindRule;
import rf.yatzy.game.core.rules.ThreesRule;
import rf.yatzy.game.core.rules.TwoPairRule;
import rf.yatzy.game.core.rules.TwosRule;
import rf.yatzy.game.core.rules.YatzyRule;
import rf.yatzy.game.core.rules.config.Rule;

/**
 * Created by rfreitas
 */
public enum RulesConfigs implements RulesConfig {
    ONES(new OnesRule()), TWOS(new TwosRule()), THREES(new ThreesRule()), FOURS(new FoursRule()), FIVES(new FivesRule()), //
    SIXES(new SixesRule()), YATZY(new YatzyRule()), CHANCE(new ChanceRule()), PAIR(new PairRule()), //
    TWO_PAIR(new TwoPairRule()), THREE_OF_A_KIND(new ThreeOfAKindRule()), FULL_HOUSE(new FullHouseRule()), //
    FOUR_OF_A_KIND(new FourOfAKindRule()), SMALL_STRAIGHTS(new SmallStraightRule()), LARGE_STRAIGHTS(new LargeStraightRule());

    private Rule rule;

    RulesConfigs(Rule rule) {
        this.rule = rule;
    }

    public Rule getRule() {
        return this.rule;
    }

    public String getRuleName() {
        return this.name();
    }
}
