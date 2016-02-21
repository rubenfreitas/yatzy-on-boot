package rf.yatzy.game.core.fixtures.rules;

/**
 * Created by rfreitas
 */
public interface RulesTestConstants {

    int[] VALID_ONES_TEST = { 1, 4, 3, 1, 1 };
    int[] NOT_VALID_ONES_TEST = { 6, 5, 3, 3, 5 };
    int ONES_SCORE = 3;

    int[] VALID_TWOS_TEST = { 2, 2, 2, 3, 1 };
    int[] NOT_VALID_TWOS_TEST = { 6, 4, 3, 3, 5 };
    int TWOS_SCORE = 6;

    int[] VALID_THREES_TEST = { 3, 4, 3, 1, 3 };
    int[] NOT_VALID_THREES_TEST = { 6, 5, 1, 1, 5 };
    int THREES_SCORE = 9;

    int[] VALID_FOURS_TEST = { 1, 4, 5, 1, 4 };
    int[] NOT_VALID_FOURS_TEST = { 6, 1, 3, 1, 5 };
    int FOURS_SCORE = 8;

    int[] VALID_FIVES_TEST = { 1, 4, 5, 3, 1 };
    int[] NOT_VALID_FIVES_TEST = { 6, 4, 1, 3, 2 };
    int FIVES_SCORE = 5;

    int[] VALID_SIXES_TEST = { 1, 6, 5, 6, 1 };
    int[] NOT_VALID_SIXES_TEST = { 1, 4, 3, 3, 5 };
    int SIXES_SCORE = 12;

    int[] CHANCE_TEST = { 1, 2, 3, 4, 5 };
    int CHANGE_SCORE = 15;

    int[] VALID_PAIR_TEST = { 1, 6, 3, 4, 6 };
    int[] NOT_VALID_PAIR_TEST = { 1, 2, 3, 4, 6 };
    int PAIR_SCORE = 12;

    int[] VALID_TWO_PAIR_TEST = { 1, 6, 3, 3, 6 };
    int[] NOT_VALID_TWO_PAIR_TEST = { 1, 6, 3, 4, 6 };
    int TWO_PAIR_SCORE = 18;

    int[] VALID_THREE_OF_A_KIND_TEST = { 1, 6, 3, 6, 6 };
    int[] NOT_VALID_THREE_OF_A_KIND_TEST = { 4, 6, 3, 4, 6 };
    int THREE_OF_A_KIND_SCORE = 18;

    int[] VALID_FOUR_OF_A_KIND_TEST = { 6, 6, 3, 6, 6 };
    int[] NOT_VALID_FOUR_OF_A_KIND_TEST = { 4, 6, 3, 4, 6 };
    int FOUR_OF_A_KIND_SCORE = 24;

    int[] VALID_YATZY_TEST = { 1, 1, 1, 1, 1 };
    int[] NOT_VALID_YATZY_TEST = { 1, 6, 3, 4, 6 };
    int YATZY_SCORE = 50;

    int[] VALID_SMALL_STRAIGHT_TEST = { 5, 1, 2, 3, 4 };
    int[] NOT_VALID_SMALL_STRAIGHT_TEST = { 1, 6, 3, 4, 6 };
    int SMALL_STRAIGHT_SCORE = 15;

    int[] VALID_LARGE_STRAIGHT_TEST = { 2, 6, 3, 4, 5 };
    int[] NOT_VALID_LARGE_STRAIGHT_TEST = { 1, 6, 3, 4, 6 };
    int LARGE_STRAIGHT_SCORE = 20;

    int[] VALID_FULL_HOUSE_TEST = { 2, 6, 2, 6, 6 };
    int[] NOT_VALID_FULL_HOUSE_TEST = { 1, 6, 6, 4, 6 };
    int FULL_HOUSE_SCORE = 22;

}
