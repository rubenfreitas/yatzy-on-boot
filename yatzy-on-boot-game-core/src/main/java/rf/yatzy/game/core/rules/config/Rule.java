package rf.yatzy.game.core.rules.config;

import rf.yatzy.game.core.DiceHash;
import rf.yatzy.game.core.config.RuleResult;

/**
 * Created by rfreitas
 */
public interface Rule {

    RuleResult execute(DiceHash dice);
}
