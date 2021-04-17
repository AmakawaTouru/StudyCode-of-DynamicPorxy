import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class GreetingBeforeAdvice implements MethodBeforeAdvice {

    /**
     * 前置增强
     * @param method 被代理的方法
     * @param objects 被代理方法的参数
     * @param o 代理类
     * @throws Throwable
     */
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        String clinetName = (String) objects[0];
        System.out.println("您好！"+clinetName+"先生！");
    }

}
