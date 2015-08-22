package rf.yatzy.game.core.rules;

import rf.yatzy.game.core.DiceHash;
import rf.yatzy.game.core.Die;

/**
 * Created by rfreitas
 */
public abstract class AbstractLowerSection {

    public static int[] countFacesOccurrences(int[] faceOccurrences, DiceHash dice) {
        for (Die die : dice.values()) {
            faceOccurrences[die.getFaceValue() - 1]++;
        }
        return faceOccurrences;
    }
}
