package rf.yatzy.game.core;

import java.util.HashMap;

/**
 * Created by rfreitas
 */
public class DiceHashMap extends HashMap<Integer, Die> {

    public DiceHashMap(HashMap<Integer, Die> diceHash) {
        super.putAll(diceHash);
    }

}
