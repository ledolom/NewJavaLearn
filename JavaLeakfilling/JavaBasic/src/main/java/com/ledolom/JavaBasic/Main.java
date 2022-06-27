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
        //协变
        User user = new User();
        FatherUser fatherUser = new FatherUser();
        List<User> list = new ArrayList<>();
//        (fatherUser)user;
        justTest(list);

        //逆变 都只能用于引用，创建对象时无法使用。
        List<FatherUser> list1 = new ArrayList<>();
        List<? super User> next = null;
        next=new ArrayList<User>();
        next=new ArrayList<FatherUser>();
        justTest1(list1);
    }

    private static void justTest(List<? extends FatherUser> user){
        System.out.printf(user.toString());
    }

    private static void justTest1(List<? super User> user){
        System.out.printf(user.toString());
    }
}
