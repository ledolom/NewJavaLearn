package com.ledolom.JavaBasic;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, NoSuchFieldException, IllegalAccessException, InvocationTargetException {
      /*  Integer code = UseEnum.NO.getCode();
        System.out.println(code);
        System.out.println(UseEnum.valueOf("YES"));*/
        User user = new User();
        user.setName("三");
        user.setAge(4);
        Class<? extends User> aClass = user.getClass();
        System.out.println(aClass);
        Method next = aClass.getMethod("next", String.class);
        next.invoke(user,"huo");
        //反射调用静态方法
        Method hai = aClass.getMethod("hai", Integer.class);
        Object invoke = hai.invoke(null, 1);
        System.out.println(invoke);


        Field age = aClass.getDeclaredField("age");
        age.setAccessible(true);
        System.out.println(age.get(user));
    }
}
