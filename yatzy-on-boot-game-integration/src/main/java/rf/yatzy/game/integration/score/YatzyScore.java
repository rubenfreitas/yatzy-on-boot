package rf.yatzy.game.integration.score;

/**
 * Created by rfreitas
 */
public class YatzyScore {

    private boolean isSet;
    private int score;

    public YatzyScore(){
        this.isSet = false;
        this.score = 0;
    }

    public boolean isSet() {
        return isSet;
    }

    public void setIsSet(boolean isSet) {
        this.isSet = isSet;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
