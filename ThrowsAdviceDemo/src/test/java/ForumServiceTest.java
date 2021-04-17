import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class ForumServiceTest {

    private ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    @Test
    public void removeForum() {
        ForumService forumService = (ForumService)applicationContext.getBean("forumService");
        forumService.removeForum(123);
    }
}