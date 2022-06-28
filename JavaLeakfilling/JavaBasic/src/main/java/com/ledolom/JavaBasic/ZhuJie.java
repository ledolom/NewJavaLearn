package com.ledolom.JavaBasic;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;


public class ZhuJie {
    public static void main(String[] args) throws NoSuchMethodException{
        //注解只是一种元数据传递的渠道，本身并没有实现功能
        Class<ZhuJie> zhuJieClass = ZhuJie.class;
        Method method = zhuJieClass.getMethod("test");
        for (Annotation annotation : method.getAnnotations()) {
            System.out.println(annotation.annotationType());
        }
        PrimaryProperty primaryPropertyAnnotation = method.getAnnotation(PrimaryProperty.class);
        System.out.println(primaryPropertyAnnotation.abc());
        System.out.println(primaryPropertyAnnotation.defaultValue());
        System.out.println(primaryPropertyAnnotation.is());


        /*
        * lambda可以直接调用，不使用外部变量
        * */
        List<Integer> integers = Arrays.asList(1, 2, 3, 4);
        integers.forEach(s-> System.out.println(s));
        //ZhuJie::lambda 属于lambda表达式的用法
        integers.forEach(ZhuJie::lambda);

        integers.forEach(Integer::intValue);
    }
    @PrimaryProperty(defaultValue = "xxxx",targetClass = ZhuJie.class,abc = 9,defaultValues = {"abc","bcd"})
    public void test(){

    }

    public static void lambda(Integer a){
        System.out.println(a);
    }
}
