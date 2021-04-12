import org.junit.Test;

import static org.junit.Assert.*;

public class ForumServiceImplTest {

    @Test
    public void removeTopic() {
        CglibProxy cglibProxy = new CglibProxy();
        ForumService proxy = (ForumService)cglibProxy.getProxy(ForumServiceImpl.class);
        proxy.removeTopic(123);
    }

    @Test
    public void removeForum() {
    }
}