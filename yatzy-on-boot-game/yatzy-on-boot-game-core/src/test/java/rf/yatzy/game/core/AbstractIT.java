package rf.yatzy.game.core;


import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by rfreitas
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= YatzyOnBootGameCoreSpringConfig.class)
public abstract class AbstractIT {

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
}
