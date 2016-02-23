package rf.yatzy.game.core.components;

import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * Created by rfreitas
 */
@Component
public class Roller {

    private static int MAX = 6;

    private static final Random RANDOMISE = new Random();

    public Integer roll(){
        return RANDOMISE.nextInt(MAX) + 1;
    }

}
