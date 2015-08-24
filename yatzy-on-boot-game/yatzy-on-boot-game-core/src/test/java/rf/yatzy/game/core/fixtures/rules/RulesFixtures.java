package rf.yatzy.game.core.fixtures.rules;

import rf.yatzy.game.core.components.DiceHash;
import rf.yatzy.game.core.components.Die;

import java.util.HashMap;

import static rf.yatzy.game.core.fixtures.rules.RulesTestConstants.CHANCE_TEST;
import static rf.yatzy.game.core.fixtures.rules.RulesTestConstants.NOT_VALID_FIVES_TEST;
import static rf.yatzy.game.core.fixtures.rules.RulesTestConstants.NOT_VALID_FOURS_TEST;
import static rf.yatzy.game.core.fixtures.rules.RulesTestConstants.NOT_VALID_FOUR_OF_A_KIND_TEST;
import static rf.yatzy.game.core.fixtures.rules.RulesTestConstants.NOT_VALID_FULL_HOUSE_TEST;
import static rf.yatzy.game.core.fixtures.rules.RulesTestConstants.NOT_VALID_LARGE_STRAIGHT_TEST;
import static rf.yatzy.game.core.fixtures.rules.RulesTestConstants.NOT_VALID_ONES_TEST;
import static rf.yatzy.game.core.fixtures.rules.RulesTestConstants.NOT_VALID_PAIR_TEST;
import static rf.yatzy.game.core.fixtures.rules.RulesTestConstants.NOT_VALID_SIXES_TEST;
import static rf.yatzy.game.core.fixtures.rules.RulesTestConstants.NOT_VALID_SMALL_STRAIGHT_TEST;
import static rf.yatzy.game.core.fixtures.rules.RulesTestConstants.NOT_VALID_THREES_TEST;
import static rf.yatzy.game.core.fixtures.rules.RulesTestConstants.NOT_VALID_THREE_OF_A_KIND_TEST;
import static rf.yatzy.game.core.fixtures.rules.RulesTestConstants.NOT_VALID_TWOS_TEST;
import static rf.yatzy.game.core.fixtures.rules.RulesTestConstants.NOT_VALID_TWO_PAIR_TEST;
import static rf.yatzy.game.core.fixtures.rules.RulesTestConstants.NOT_VALID_YATZY_TEST;
import static rf.yatzy.game.core.fixtures.rules.RulesTestConstants.VALID_FIVES_TEST;
import static rf.yatzy.game.core.fixtures.rules.RulesTestConstants.VALID_FOURS_TEST;
import static rf.yatzy.game.core.fixtures.rules.RulesTestConstants.VALID_FOUR_OF_A_KIND_TEST;
import static rf.yatzy.game.core.fixtures.rules.RulesTestConstants.VALID_FULL_HOUSE_TEST;
import static rf.yatzy.game.core.fixtures.rules.RulesTestConstants.VALID_LARGE_STRAIGHT_TEST;
import static rf.yatzy.game.core.fixtures.rules.RulesTestConstants.VALID_ONES_TEST;
import static rf.yatzy.game.core.fixtures.rules.RulesTestConstants.VALID_PAIR_TEST;
import static rf.yatzy.game.core.fixtures.rules.RulesTestConstants.VALID_SIXES_TEST;
import static rf.yatzy.game.core.fixtures.rules.RulesTestConstants.VALID_SMALL_STRAIGHT_TEST;
import static rf.yatzy.game.core.fixtures.rules.RulesTestConstants.VALID_THREES_TEST;
import static rf.yatzy.game.core.fixtures.rules.RulesTestConstants.VALID_THREE_OF_A_KIND_TEST;
import static rf.yatzy.game.core.fixtures.rules.RulesTestConstants.VALID_TWOS_TEST;
import static rf.yatzy.game.core.fixtures.rules.RulesTestConstants.VALID_TWO_PAIR_TEST;
import static rf.yatzy.game.core.fixtures.rules.RulesTestConstants.VALID_YATZY_TEST;


/**
 * Created by rfreitas
 */
public abstract class RulesFixtures {

    public static DiceHash testWithCustomDiceHash(int[] customHash) { return new DiceHash(testDiceHash(customHash)); }

    public static DiceHash testValidOnesDiceHash(){
        return new DiceHash(testDiceHash(VALID_ONES_TEST));
    }

    public static DiceHash testNotValidOnesDiceHash(){
        return new DiceHash(testDiceHash(NOT_VALID_ONES_TEST));
    }

    public static DiceHash testValidTwosDiceHash(){
        return new DiceHash(testDiceHash(VALID_TWOS_TEST));
    }

    public static DiceHash testNotValidTwosDiceHash(){
        return new DiceHash(testDiceHash(NOT_VALID_TWOS_TEST));
    }

    public static DiceHash testValidThreesDiceHash(){
        return new DiceHash(testDiceHash(VALID_THREES_TEST));
    }

    public static DiceHash testNotValidThreesDiceHash(){ return new DiceHash(testDiceHash(NOT_VALID_THREES_TEST)); }

    public static DiceHash testValidFoursDiceHash(){ return new DiceHash(testDiceHash(VALID_FOURS_TEST)); }

    public static DiceHash testNotValidFoursDiceHash(){ return new DiceHash(testDiceHash(NOT_VALID_FOURS_TEST)); }

    public static DiceHash testValidFivesDiceHash(){
        return new DiceHash(testDiceHash(VALID_FIVES_TEST));
    }

    public static DiceHash testNotValidFivesDiceHash(){
        return new DiceHash(testDiceHash(NOT_VALID_FIVES_TEST));
    }

    public static DiceHash testValidSixesDiceHash(){
        return new DiceHash(testDiceHash(VALID_SIXES_TEST));
    }

    public static DiceHash testNotValidSixesDiceHash(){
        return new DiceHash(testDiceHash(NOT_VALID_SIXES_TEST));
    }

    public static DiceHash testValidPairDiceHash(){
        return new DiceHash(testDiceHash(VALID_PAIR_TEST));
    }

    public static DiceHash testNotValidPairDiceHash(){
        return new DiceHash(testDiceHash(NOT_VALID_PAIR_TEST));
    }

    public static DiceHash testValidTwoPairDiceHash(){
        return new DiceHash(testDiceHash(VALID_TWO_PAIR_TEST));
    }

    public static DiceHash testNotValidTwoPairDiceHash(){
        return new DiceHash(testDiceHash(NOT_VALID_TWO_PAIR_TEST));
    }

    public static DiceHash testChanceDiceHash() { return new DiceHash(testDiceHash(CHANCE_TEST)); }

    public static DiceHash testValidYatzyDiceHash() { return new DiceHash(testDiceHash(VALID_YATZY_TEST)); }

    public static DiceHash testNotValidYatzyDiceHash() { return new DiceHash(testDiceHash(NOT_VALID_YATZY_TEST)); }

    public static DiceHash testValidThreeOfAKindDiceHash() { return new DiceHash(testDiceHash(VALID_THREE_OF_A_KIND_TEST)); }

    public static DiceHash testNotValidThreeOfAKindDiceHash() { return new DiceHash(testDiceHash(NOT_VALID_THREE_OF_A_KIND_TEST)); }

    public static DiceHash testValidFourOfAKindDiceHash() { return new DiceHash(testDiceHash(VALID_FOUR_OF_A_KIND_TEST)); }

    public static DiceHash testNotValidFourOfAKindDiceHash() { return new DiceHash(testDiceHash(NOT_VALID_FOUR_OF_A_KIND_TEST)); }

    public static DiceHash testValidSmallStraightDiceHash() { return new DiceHash(testDiceHash(VALID_SMALL_STRAIGHT_TEST)); }

    public static DiceHash testNotValidSmallStraightDiceHash() { return new DiceHash(testDiceHash(NOT_VALID_SMALL_STRAIGHT_TEST)); }

    public static DiceHash testValidLargeStraightDiceHash() { return new DiceHash(testDiceHash(VALID_LARGE_STRAIGHT_TEST)); }

    public static DiceHash testNotValidLargeStraightDiceHash() { return new DiceHash(testDiceHash(NOT_VALID_LARGE_STRAIGHT_TEST)); }

    public static DiceHash testValidFullHouseDiceHash() { return new DiceHash(testDiceHash(VALID_FULL_HOUSE_TEST)); }

    public static DiceHash testNotValidFullHouseDiceHash() { return new DiceHash(testDiceHash(NOT_VALID_FULL_HOUSE_TEST)); }

    private static HashMap<Integer,Die> testDiceHash(int[] diceFaceValues) {
        HashMap<Integer, Die> diceHash = new HashMap<Integer, Die>();
        for (int i = 0; i < 5 ; i++) {
            diceHash.put((i + 1), new Die(diceFaceValues[i]));
        }
        return diceHash;
    }
}
