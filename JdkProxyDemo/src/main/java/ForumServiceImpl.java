public class ForumServiceImpl implements ForumService{

    @Override
    public void removeTopic(int topicId) {
        PerformanceMonitor.begin(ForumService.class.getName());
        System.out.println("模拟删除Topic第"+topicId+"条记录");
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        PerformanceMonitor.end();
    }

    @Override
    public void removeForum(int forumId) {
        PerformanceMonitor.begin(ForumServiceImpl.class.getName());
        System.out.println("模拟删除Forum第"+forumId+"条记录");
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        PerformanceMonitor.end();
    }
}
