import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class ForumServiceImplTest {

    private ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

    @Test
    public void removeTopic() {
        ForumService forumService = (ForumService)applicationContext.getBean("forumService");
        forumService.removeTopic(123);

        Monitorable monitorable = (Monitorable) forumService;
        monitorable.setMonitorActive(true);
        forumService.removeTopic(234);

    }

    @Test
    public void removeForum() {
    }
}