import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.DynamicMethodMatcherPointcut;

import java.io.Writer;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class GreetDynamicAdvisor extends DynamicMethodMatcherPointcut {

    private static List<String> specialName = new ArrayList<>();

    static {
        specialName.add("哈尔希洛");
        specialName.add("梅丽");
    }

    //先进行类匹配
    @Override
    public ClassFilter getClassFilter() {
        return new ClassFilter() {
            @Override
            public boolean matches(Class<?> aClass) {
                return Waiter.class.isAssignableFrom(aClass);
            }
        };
    }

    //进行静态检查
    @Override
    public boolean matches(Method method, Class<?> targetClass) {
        return "greetTo".equals(method.getName());
    }

    //进行动态检查
    @Override
    public boolean matches(Method method, Class<?> aClass, Object... objects) {
        String clientName = (String) objects[0];
        System.out.println("进行了动态检查");
        return specialName.contains(clientName);
    }


}
