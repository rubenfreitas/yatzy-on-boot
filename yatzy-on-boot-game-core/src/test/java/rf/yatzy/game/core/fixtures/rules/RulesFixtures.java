package rf.yatzy.game.core.fixtures.rules;

import rf.yatzy.game.core.DiceHashMap;
import rf.yatzy.game.core.Die;

import java.util.HashMap;

import static rf.yatzy.game.core.fixtures.rules.RulesTestConstants.*;

/**
 * Created by rfreitas
 */
public abstract class RulesFixtures {

    public static DiceHashMap testValidOnesDiceHash(){
        return new DiceHashMap(testDiceHash(VALID_ONES_TEST));
    }

    public static DiceHashMap testNotValidOnesDiceHash(){
        return new DiceHashMap(testDiceHash(NOT_VALID_ONES_TEST));
    }

    public static DiceHashMap testValidTwosDiceHash(){
        return new DiceHashMap(testDiceHash(VALID_TWOS_TEST));
    }

    public static DiceHashMap testNotValidTwosDiceHash(){
        return new DiceHashMap(testDiceHash(NOT_VALID_TWOS_TEST));
    }

    public static DiceHashMap testValidThreesDiceHash(){
        return new DiceHashMap(testDiceHash(VALID_THREES_TEST));
    }

    public static DiceHashMap testNotValidThreesDiceHash(){
        return new DiceHashMap(testDiceHash(NOT_VALID_THREES_TEST));
    }

    public static DiceHashMap testValidFoursDiceHash(){

        return new DiceHashMap(testDiceHash(VALID_FOURS_TEST));
    }

    public static DiceHashMap testNotValidFoursDiceHash(){
        return new DiceHashMap(testDiceHash(NOT_VALID_FOURS_TEST));
    }

    public static DiceHashMap testValidFivesDiceHash(){
        return new DiceHashMap(testDiceHash(VALID_FIVES_TEST));
    }

    public static DiceHashMap testNotValidFivesDiceHash(){
        return new DiceHashMap(testDiceHash(NOT_VALID_FIVES_TEST));
    }

    public static DiceHashMap testValidSixesDiceHash(){
        return new DiceHashMap(testDiceHash(VALID_SIXES_TEST));
    }

    public static DiceHashMap testNotValidSixesDiceHash(){
        return new DiceHashMap(testDiceHash(NOT_VALID_SIXES_TEST));
    }

    private static HashMap<Integer,Die> testDiceHash(int[] diceFaceValues) {
        HashMap<Integer, Die> diceHash = new HashMap<Integer, Die>();
        for (int i = 0; i < 6 ; i++) {
            diceHash.put((i + 1), new Die(diceFaceValues[i]));
        }
        return diceHash;
    }
}
