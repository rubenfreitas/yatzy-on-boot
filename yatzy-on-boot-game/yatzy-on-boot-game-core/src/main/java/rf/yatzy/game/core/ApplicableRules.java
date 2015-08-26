package rf.yatzy.game.core;

import rf.yatzy.game.core.config.RuleResult;

import java.util.HashMap;

/**
 * Created by rfreitas
 */
public class ApplicableRules {

    private HashMap<String, RuleResult> applicableResults;

    public ApplicableRules(){
        this.applicableResults = new HashMap<String, RuleResult>();
    }

    public ApplicableRules(HashMap<String, RuleResult> applicableResults){
        this.applicableResults = applicableResults;
    }

    public void put(String key, RuleResult value) {
        applicableResults.put(key, value);
    }

    public void getAllResults(){
        applicableResults.values();
    }

    public int getApplicableResultsCount(){
        return applicableResults.size();
    }

    public RuleResult getRuleByKey(String key) {
        return applicableResults.get(key);
    }
}
