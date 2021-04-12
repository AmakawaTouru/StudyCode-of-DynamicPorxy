public class ForumServiceImpl implements ForumService{

    @Override
    public void removeTopic(int topicId) {
        System.out.println("模拟删除Topic第"+topicId+"条记录");
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void removeForum(int forumId) {
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
