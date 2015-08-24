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
        //TODO: clean score of the ones that didn't get locked
        yatzyScore.setLocked();
        return yatzyScore;
    }

    public DiceHash role() {
        return new DiceHash(generateNewDiceHash());
    }

    public DiceHash reRole() {
        return new DiceHash(generateNewDiceHash());
    }

}
