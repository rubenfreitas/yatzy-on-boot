package rf.yatzy.game.integration;

import org.springframework.beans.factory.annotation.Autowired;
import rf.yatzy.game.core.components.Die;
import rf.yatzy.game.core.components.Roller;

import java.util.HashMap;

/**
 * Created by rfreitas
 */
public class AbstractYatzyService {

    @Autowired
    private Roller roller;

    protected Roller getRoller() {
        return roller;
    }

    protected HashMap<Integer,Die> generateNewDiceHash() {
        HashMap<Integer,Die> diceHash = new HashMap<Integer,Die>();
        for(int i = 1; i < 6; i++) {
            diceHash.put(i, new Die(getRoller().roll()));
        }
        return diceHash;
    }
}
