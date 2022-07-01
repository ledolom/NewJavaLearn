package com.ledolom.JavaBasic.concurrent;

import java.util.concurrent.*;

public class ThreadPoolAppMain {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        executorService.submit(new Runnable() {
            @Override
            public void run() {
                printExecuteThreadStatus("run 方法");
            }
        });
        System.out.println("已经提交 run Task");


        Future<String> future = executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                printExecuteThreadStatus("call 方法");
                System.out.println("执行call任务ing");
                Thread.sleep(TimeUnit.SECONDS.toMillis(5));
                System.out.println("执行call任务结束");
                return "这是call返回的结果";
            }
        });
        System.out.println("已经提交 call Task");

        System.out.println("任务提交完毕");
        System.out.println("关闭线程池");
        /**
         * 向线程池提交任务之后，线程池执行任务，
         * 当执行shutdown方法之后不会立刻关闭线程池，然后等线程池中的task执行完之后再关闭线程池
         *
         *
         */
        executorService.shutdown();

        try {
            System.out.println("开始获取call task的执行结果");
            /**
             * 获取到之前任务执行的结果:过程如下：
             *
             * pool-1-thread-1这是在线程池里执行的代码:call 方法
             * 执行call任务ing
             * 开始获取call task的执行结果
             *
             * 现在睡两秒。。。。。。
             *
             * 执行call任务结束
             * 获取到的执行结果为：这是call返回的结果
             */
            String result = future.get();
            System.out.println("获取到的执行结果为："+result);
        }catch (InterruptedException e){
            e.printStackTrace();
        }catch (ExecutionException e){
            e.printStackTrace();
        }
    }

    private static void printExecuteThreadStatus(String phase){
        System.out.println(Thread.currentThread().getName()+"这是在线程池里执行的代码:"+phase);
    }
}
