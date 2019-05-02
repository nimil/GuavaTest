package functional;

import com.google.common.base.Stopwatch;

import java.util.concurrent.TimeUnit;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/5/2
 * @Time:21:59
 */
public class StopWatchTest {

    public static void main(String[] args) throws InterruptedException {
        processGuava("ssss");
    }

       private static void process(String orderNo) throws InterruptedException {
        System.out.printf("start process the order %s\n",orderNo);
        long c = System.currentTimeMillis();
        TimeUnit.SECONDS.sleep(1);
        System.out.printf("end process the order %s end %d",orderNo,(System.currentTimeMillis()-c));
    }

    /**
     * Guava版本的
     * @param orderNo
     * @throws InterruptedException
     */
    private static void processGuava(String orderNo) throws InterruptedException {
        System.out.printf("start process the order %s\n",orderNo);
        Stopwatch started = Stopwatch.createStarted();
        TimeUnit.SECONDS.sleep(1);
        System.out.printf("end process the order %s end %s",orderNo,started.stop());
    }


}
