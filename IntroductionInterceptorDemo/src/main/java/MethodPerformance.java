/**
 * 计算方法调用花费时间
 */
public class MethodPerformance {
    private long begin;
    private long end;
    private  String serviceMethod;


    public MethodPerformance(String serviceMethod) {
        this.serviceMethod = serviceMethod;
        this.begin = System.currentTimeMillis();
    }

    /**
     * 获取方法调用花费时间
     */
    public void printPerformance(){
        end = System.currentTimeMillis();
        long elapse = end -begin;
        System.out.println(serviceMethod+"花费"+elapse+"毫秒");
    }

}
