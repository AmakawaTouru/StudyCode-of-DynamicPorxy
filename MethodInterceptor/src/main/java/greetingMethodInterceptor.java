import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class greetingMethodInterceptor implements MethodInterceptor {



    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        String clientName = (String)objects[0];
        System.out.println("您好！"+clientName+"先生！");
        Object o1 = methodProxy.invokeSuper(o, objects);
        System.out.println("欢迎下次光临！");
        return o1;
    }
}
