package rf.yatzy.game.core.components;

import java.util.Collection;
import java.util.HashMap;

/**
 * Created by rfreitas
 */
public class DiceHash {

    private HashMap<Integer, Die> diceHash;

    public DiceHash(HashMap<Integer, Die> diceHash) {
        this.diceHash = diceHash;
    }

    public void put(int key, Die die) {
        diceHash.put(key, die);
    }

    public Die getDieByKey(Integer key) {
        return diceHash.get(key);
    }

    public Collection<Die> getAllDice() {
        return diceHash.values();
    }

}
