package rf.yatzy.game.core.rules.config;

import rf.yatzy.game.core.DiceHashMap;
import rf.yatzy.game.core.config.RuleResult;

/**
 * Created by rfreitas
 */
public interface Rule {

    RuleResult execute(DiceHashMap dice);
}
