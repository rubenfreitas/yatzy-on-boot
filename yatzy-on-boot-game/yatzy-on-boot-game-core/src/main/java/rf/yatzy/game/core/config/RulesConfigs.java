package rf.yatzy.game.core.config;

import rf.yatzy.game.core.rules.Chance;
import rf.yatzy.game.core.rules.Fives;
import rf.yatzy.game.core.rules.FourOfAKind;
import rf.yatzy.game.core.rules.Fours;
import rf.yatzy.game.core.rules.FullHouse;
import rf.yatzy.game.core.rules.LargeStraight;
import rf.yatzy.game.core.rules.Ones;
import rf.yatzy.game.core.rules.Pair;
import rf.yatzy.game.core.rules.Sixes;
import rf.yatzy.game.core.rules.SmallStraight;
import rf.yatzy.game.core.rules.ThreeOfAKind;
import rf.yatzy.game.core.rules.Threes;
import rf.yatzy.game.core.rules.TwoPair;
import rf.yatzy.game.core.rules.Twos;
import rf.yatzy.game.core.rules.Yatzy;
import rf.yatzy.game.core.rules.config.Rule;

/**
 * Created by rfreitas
 */
public enum RulesConfigs implements RulesConfig {
    ONES(new Ones()), TWOS(new Twos()), THREES(new Threes()), FOURS(new Fours()), FIVES(new Fives()), SIXES(new Sixes()), //
    YATZY(new Yatzy()), CHANCE(new Chance()), PAIR(new Pair()), TWO_PAIR(new TwoPair()), THREE_OF_A_KIND(new ThreeOfAKind()), //
    FULL_HOUSE(new FullHouse()), FOUR_OF_A_KIND(new FourOfAKind()), SMALL_STRAIGHTS(new SmallStraight()), //
    LARGE_STRAIGHTS(new LargeStraight());

    private Rule rule;

    RulesConfigs(Rule rule) {
        this.rule = rule;
    }

    public Rule getRule() {
        return rule;
    }
}
