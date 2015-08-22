package rf.yatzy.game.core;

import org.junit.Test;
import org.mockito.InjectMocks;

import static org.junit.Assert.assertTrue;

/**
 * Created by rfreitas
 */
public class RollerTest extends AbstractIT {

    private static final int RUN_TIMES = 1000;

    @InjectMocks
    private Roller roller;

    @Test
    public void shouldOnlyGenerateValidSixFacedDicedNumbers() {

        for(int i = 0; i < RUN_TIMES; i++) {
            int result = roller.roll();

            assertTrue(result <= 6 && result >= 1);
        }
    }

}