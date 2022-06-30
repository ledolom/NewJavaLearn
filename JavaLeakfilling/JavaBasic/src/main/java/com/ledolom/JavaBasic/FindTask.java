package com.ledolom.JavaBasic;

import java.util.TimerTask;

public class FindTask extends TimerTask {
    @Override
    public void run() {
        try {
            System.out.println("ASC");
        }catch (Exception e){
            e.printStackTrace();
        }
        //一般包上try catch,如果出现异常task会终止执行
//        throw new RuntimeException("cuocuo");
    }
}
