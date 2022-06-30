package com.ledolom.JavaBasic.concurrent;

/**
 * CAS实现锁，内存地址A存的是0 CAS拿着（内存地址A，旧的值0，要改变的值1） 去改，内存的值和旧的值相等就改为1，其他人再跟他改就会失败。自旋就是不断重试
 */
public class Concurrent {
}
