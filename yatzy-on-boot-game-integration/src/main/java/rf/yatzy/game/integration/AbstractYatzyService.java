package rf.yatzy.game.integration;

import org.springframework.beans.factory.annotation.Autowired;
import rf.yatzy.game.core.components.Roller;

/**
 * Created by rfreitas
 */
public class AbstractYatzyService {

    @Autowired
    private Roller roller;

    public Roller getRoller() {
        return roller;
    }
}
