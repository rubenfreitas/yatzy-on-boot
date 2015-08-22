package rf.yatzy.game.core;


import org.junit.Before;
import org.mockito.MockitoAnnotations;

/**
 * Created by rfreitas
 */
//@RunWith(SpringJUnit4ClassRunner.class)
public abstract class AbstractIT {

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
}
