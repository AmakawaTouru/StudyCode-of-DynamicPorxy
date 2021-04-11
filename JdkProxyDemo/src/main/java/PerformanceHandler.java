import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PerformanceHandler implements InvocationHandler {

    //被代理类
    private Object target;

    public PerformanceHandler(Object target) {
        this.target = target;
    }

    /**
     * 横切逻辑代码
     * @param proxy 生成的代理类，一般不用
     * @param method 调用的方法，通过反射来调用被代理类原本的方法内容
     * @param args 调用的方法的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        PerformanceMonitor.begin(target.getClass().getName()+"."+method.getName());
        Object obj = method.invoke(target, args);
        PerformanceMonitor.end();
        return obj;
    }
}
