package rf.yatzy.game.core;

import org.springframework.stereotype.Component;
import rf.yatzy.game.core.components.DiceHash;
import rf.yatzy.game.core.config.RuleResult;
import rf.yatzy.game.core.config.RulesConfig;
import rf.yatzy.game.core.config.RulesConfigs;

/**
 * Created by rfreitas
 */
@Component
public class YatzyRuler {

    public ApplicableRules run(DiceHash diceHash){
        ApplicableRules applicableRules = new ApplicableRules();
        for(RulesConfig config : RulesConfigs.values()){
            RuleResult result = config.getRule().execute(diceHash);
            if(result.isValid()) {
                applicableRules.put(config.getRuleName(), result);
            }
        }
        return applicableRules;
    }
}
