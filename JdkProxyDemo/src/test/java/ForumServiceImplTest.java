import org.junit.Test;

import static org.junit.Assert.*;

public class ForumServiceImplTest {

    ForumService forumService = new ForumServiceImpl();

    @Test
    public void removeTopic() {
        forumService.removeTopic(123);
    }

    @Test
    public void removeForum() {
        forumService.removeTopic(456);
    }
}