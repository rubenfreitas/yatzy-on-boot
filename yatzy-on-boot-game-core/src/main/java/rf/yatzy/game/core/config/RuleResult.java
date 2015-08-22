package rf.yatzy.game.core.config;

/**
 * Created by rfreitas
 */
public class RuleResult {

    private Boolean isValid;
    private int sum;

    public RuleResult(Boolean isValid, int sum) {
        this.isValid = isValid;
        this.sum = sum;
    }

    public Boolean isValid() {
        return isValid;
    }

    public int getSum() { return sum; }

}
