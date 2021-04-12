/**
 * 方法计时监视器
 */
public class PerformanceMonitor {


    private static ThreadLocal<MethodPerformance> performanceRecord = new ThreadLocal<MethodPerformance>();

    /**
     * 开启监听器
     * @param method 传入监听的方法
     */
    public static void begin(String method){
        System.out.println("starting monitor...");
        MethodPerformance mp = new MethodPerformance(method);
        performanceRecord.set(mp);
    }

    /**
     * 关闭监听器，并输出方法用了多少时间
     */
    public static void end(){
        System.out.println("end monitor");
        MethodPerformance mp = performanceRecord.get();
        mp.printPerformance();
    }

}
