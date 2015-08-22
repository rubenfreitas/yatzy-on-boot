package rf.yatzy.game.core.fixtures.rules;

/**
 * Created by rfreitas
 */
interface RulesTestConstants {

    int[] VALID_ONES_TEST = { 1, 4, 5, 3, 1, 1 };
    int[] NOT_VALID_ONES_TEST = { 6, 4, 5, 3, 3, 5 };

    int[] VALID_TWOS_TEST = { 2, 2, 2, 3, 1, 1 };
    int[] NOT_VALID_TWOS_TEST = { 6, 4, 5, 3, 3, 5 };

    int[] VALID_THREES_TEST = { 3, 4, 5, 3, 1, 3 };
    int[] NOT_VALID_THREES_TEST = { 6, 4, 5, 1, 1, 5 };

    int[] VALID_FOURS_TEST = { 1, 4, 5, 3, 1, 4 };
    int[] NOT_VALID_FOURS_TEST = { 6, 1, 5, 3, 1, 5 };

    int[] VALID_FIVES_TEST = { 1, 4, 5, 3, 1, 1 };
    int[] NOT_VALID_FIVES_TEST = { 6, 4, 1, 3, 3, 2 };

    int[] VALID_SIXES_TEST = { 1, 6, 5, 6, 1, 1 };
    int[] NOT_VALID_SIXES_TEST = { 1, 4, 5, 3, 3, 5 };
}
