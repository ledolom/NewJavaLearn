package com.ledolom.JavaBasic;

import com.alibaba.fastjson.JSONObject;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, NoSuchFieldException, IllegalAccessException, InvocationTargetException {
      /*  Integer code = UseEnum.NO.getCode();
        System.out.println(code);
        System.out.println(UseEnum.valueOf("YES"));*/
       /* User user = new User();
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
        System.out.println(age.get(user));*/
        List<String> list = new ArrayList<>();
        list.add("string");
        list.add("string1");
        list.add("string2");
        String s = JSONObject.toJSONString(list);
        System.out.println(s);
    }
}
