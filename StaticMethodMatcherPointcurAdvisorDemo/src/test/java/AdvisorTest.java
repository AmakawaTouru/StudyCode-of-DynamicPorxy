import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AdvisorTest {

    private ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    @Test
    public void test(){
        Waiter waiter = (Waiter) applicationContext.getBean("waiter");
        Seller seller = (Seller) applicationContext.getBean("seller");
        waiter.greetTo("哈尔希洛");
        waiter.serveTo("梅丽");
        seller.greetTo("莫古索");
    }
}
