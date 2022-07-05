package com.ledolom.JavaBasic.concurrent;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * CAS实现锁，内存地址A存的是0 CAS拿着（内存地址A，旧的值0，要改变的值1） 去改，内存的值和旧的值相等就改为1，
 * 其他人再跟他改就会失败。自旋就是不断重试
 *
 * concurrent包中的常用的锁ReentrantLock可以被线程重复获取。获取后数量加一，用完给它减一，对标synchronized
 * 相当于synchronized锁住一个类
 *
 * countdownLatch可以代替Thread中的join,并且比join更加灵活（在使用时不用管线程的状态。），countdownLatch设置好10个之后，每个线程干完之后
 * 调一下countDown方法，并且不需要结束还可以做其他事情。等10个全都执行完了也就是执行await方法，无需等待。就执行下一步。
 *
 */
public class Concurrent {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);
        List<String> collect = list.stream().map(i -> {
            return i.toString();
        }).collect(Collectors.toList());
        System.out.println(collect);
    }
    public static void test(){

    }
}
