package com.ledolom.JavaBasic.concurrent;

import java.util.concurrent.LinkedBlockingDeque;

public class CollectionAppMain {
    public static void main(String[] args) {
        LinkedBlockingDeque<String> linkedBlockingDeque = new LinkedBlockingDeque<>(128);
        String peek = linkedBlockingDeque.peek();//不会取出
        linkedBlockingDeque.offer("");
        linkedBlockingDeque.poll();//会取出

        try {
            //将元素加入队列，如果满了就等着
            linkedBlockingDeque.put("");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            //一定要拿到一个，否则就无限等待
            linkedBlockingDeque.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //使用put和take实现生产者和消费者
    }
}
