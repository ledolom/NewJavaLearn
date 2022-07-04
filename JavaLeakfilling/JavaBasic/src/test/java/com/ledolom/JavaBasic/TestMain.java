package com.ledolom.JavaBasic;

import com.ledolom.JavaBasic.concurrent.Concurrent;
import com.ledolom.JavaBasic.concurrent.ThreadPoolAppMain;
import org.junit.Test;

public class TestMain {

    @Test
    public void test1(){
        Concurrent concurrent = new Concurrent();
        concurrent.test();
        Concurrent.test();
    }
}
