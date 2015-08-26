package rf.yatzy.webapp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by rfreitas
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = YatzyOnBootApplication.class)
@WebAppConfiguration
public class YatzyOnBootApplicationTests {

	@Test
	public void contextLoads() {
	}

}
