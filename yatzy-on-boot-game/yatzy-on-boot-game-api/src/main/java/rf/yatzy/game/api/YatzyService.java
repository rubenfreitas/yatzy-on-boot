package rf.yatzy.game.api;

import org.springframework.stereotype.Service;
import rf.yatzy.game.core.components.DiceHash;
import rf.yatzy.game.api.score.YatzyScore;
import rf.yatzy.game.api.score.YatzyScoreBoard;

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
