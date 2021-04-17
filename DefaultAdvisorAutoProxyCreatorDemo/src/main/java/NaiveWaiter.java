public class NaiveWaiter implements Waiter{
    @Override
    public void greetTo(String name) {
        System.out.println("给"+name+"打招呼...");
    }

    @Override
    public void serveTo(String name) {
        System.out.println("给"+name+"服务...");
    }
}
