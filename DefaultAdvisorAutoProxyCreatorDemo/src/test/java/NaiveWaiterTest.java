import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class NaiveWaiterTest {

    private ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    @Test
    public void greetTo() {
        Waiter waiter = (Waiter) applicationContext.getBean("waiter");
        Seller seller = (Seller) applicationContext.getBean("seller");
        waiter.greetTo("哈尔希洛");
        waiter.serveTo("兰德");
        seller.greetTo("梅丽");
    }

    @Test
    public void serveTo() {
    }
}