package rf.yatzy.game.integration;

import org.springframework.stereotype.Service;
import rf.yatzy.game.core.components.DiceHash;
import rf.yatzy.game.integration.score.YatzyScore;
import rf.yatzy.game.integration.score.YatzyScoreBoard;

/**
 * Created by rfreitas
 */
@Service
public class YatzyService extends AbstractYatzyService {

    public YatzyScoreBoard updateScoreBoard(YatzyScoreBoard scoreBoard, DiceHash diceHash) {
        return scoreBoard;
    }

    public YatzyScore lockScore(YatzyScore yatzyScore) {
        yatzyScore.setLocked();
        return yatzyScore;
    }

    public DiceHash roll() {
        return new DiceHash(generateNewDiceHash());
    }

    //TODO: reRoll method

    //TODO: calculateBonus

}
