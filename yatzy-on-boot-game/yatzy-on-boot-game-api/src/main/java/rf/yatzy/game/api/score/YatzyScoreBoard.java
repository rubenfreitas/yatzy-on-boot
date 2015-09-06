package rf.yatzy.game.api.score;

import java.util.EnumSet;
import java.util.HashMap;

/**
 * Created by rfreitas
 */
public class YatzyScoreBoard extends HashMap<YatzyTypes, YatzyScore> {

    public YatzyScoreBoard(EnumSet<YatzyTypes> yatzyScoreTypes) {
        for(YatzyTypes type : yatzyScoreTypes) {
            super.put(type, new YatzyScore());
        }
    }
}
