package rf.yatzy.game.integration;

import org.junit.Test;
import org.mockito.InjectMocks;
import rf.yatzy.game.core.components.DiceHash;

import static org.junit.Assert.assertNotNull;

/**
 * Created by rfreitas
 */
public class YatzyServiceIT extends AbstractIT {

    @InjectMocks
    YatzyService service;

    @Test
    public void shouldGenerateDiceHash() {
        DiceHash diceHash = service.role();

        assertNotNull(diceHash);
    }

}
