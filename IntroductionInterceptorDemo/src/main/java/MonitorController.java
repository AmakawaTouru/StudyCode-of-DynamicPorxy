import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;

public class MonitorController extends DelegatingIntroductionInterceptor implements Monitorable {

    //解决单线程线程安全的问题，用ThreadLocal让每个线程单独使用一个状态
    private ThreadLocal<Boolean> MonitorStatusMap = new ThreadLocal<Boolean>();

    @Override
    public void setMonitorActive(boolean active) {
        MonitorStatusMap.set(active);
    }

    //重写拦截方法
    @Override
    public Object invoke(MethodInvocation mi) throws Throwable {
        Object obj = null;

        if(MonitorStatusMap.get()!= null && MonitorStatusMap.get()){
            PerformanceMonitor.begin(mi.getClass().getName()+"."+mi.getMethod().getName());
            obj = super.invoke(mi);
            PerformanceMonitor.end();
        }else{
            obj = super.invoke(mi);
        }
        return obj;
    }
}
