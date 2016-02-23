package rf.yatzy.game.core.components;

import java.io.Serializable;

/**
 * Created by rfreitas
 */
public class Die implements Serializable {

    private Integer faceValue;

    public Die(Integer faceValue) {
        this.faceValue = faceValue;
    }

    public Integer getFaceValue() {
        return faceValue;
    }
}
