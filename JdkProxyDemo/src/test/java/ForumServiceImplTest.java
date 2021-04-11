import org.junit.Test;

import java.lang.reflect.Proxy;

import static org.junit.Assert.*;

public class ForumServiceImplTest {

    ForumService forumService = new ForumServiceImpl();

    @Test
    public void removeTopic() {
        PerformanceHandler handler = new PerformanceHandler(forumService);
        ForumService proxy = (ForumService)Proxy.newProxyInstance(forumService.getClass().getClassLoader(),
                forumService.getClass().getInterfaces(),
                handler);
        proxy.removeTopic(123);
    }

    @Test
    public void removeForum() {
        forumService.removeTopic(456);
    }
}