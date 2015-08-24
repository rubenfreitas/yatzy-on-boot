package rf.yatzy.game.integration.score;

/**
 * Created by rfreitas
 */
public class YatzyScore {

    private boolean isLocked;
    private int score;

    public YatzyScore(){
        this.isLocked = false;
        this.score = 0;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked() {
        this.isLocked = true;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
