package rf.yatzy.game.core;

import java.util.Random;

/**
 * Created by rfreitas
 */
public class Roller {

    private static int MAX = 6;

    public int roll(){
        return new Random().nextInt(MAX) + 1;
    }

}
