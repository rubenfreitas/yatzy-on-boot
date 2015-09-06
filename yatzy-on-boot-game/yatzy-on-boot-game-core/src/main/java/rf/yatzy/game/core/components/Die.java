package rf.yatzy.game.core.components;

import java.io.Serializable;

/**
 * Created by rfreitas
 */
public class Die implements Serializable {

    private int faceValue;

    public Die(int faceValue) {
        this.faceValue = faceValue;
    }

    public int getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(int faceValue) {
        this.faceValue = faceValue;
    }
}
