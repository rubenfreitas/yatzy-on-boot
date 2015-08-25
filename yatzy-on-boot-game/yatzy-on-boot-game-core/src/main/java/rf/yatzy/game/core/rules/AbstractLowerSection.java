package rf.yatzy.game.core.rules;

import rf.yatzy.game.core.components.DiceHash;
import rf.yatzy.game.core.components.Die;

/**
 * Created by rfreitas
 */
abstract class AbstractLowerSection {

    protected static int[] countFacesOccurrences(int[] faceOccurrences, DiceHash dice) {
        for (Die die : dice.values()) {
            faceOccurrences[die.getFaceValue() - 1]++;
        }
        return faceOccurrences;
    }

}
