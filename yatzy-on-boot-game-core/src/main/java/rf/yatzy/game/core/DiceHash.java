package rf.yatzy.game.core;

import java.util.HashMap;

/**
 * Created by rfreitas
 */
public class DiceHash extends HashMap<Integer, Die> {

    public DiceHash(HashMap<Integer, Die> diceHash) {
        super.putAll(diceHash);
    }

}
