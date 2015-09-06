package rf.yatzy.game.integration;


import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import rf.yatzy.game.integration.config.YatzyOnBootGameIntegrationSpringConfig;

/**
 * Created by rfreitas
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=YatzyOnBootGameIntegrationSpringConfig.class)
public abstract class AbstractIT {

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
}
