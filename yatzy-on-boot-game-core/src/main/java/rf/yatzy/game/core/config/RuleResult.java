package rf.yatzy.game.core.config;

/**
 * Created by rfreitas
 */
public class RuleResult {

    private Boolean isValid;
    private int score;

    public RuleResult(Boolean isValid, int score) {
        this.isValid = isValid;
        this.score = score;
    }

    public Boolean isValid() {
        return isValid;
    }

    public int getScore() { return score; }

}
