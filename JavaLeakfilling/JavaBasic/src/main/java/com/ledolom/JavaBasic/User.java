package com.ledolom.JavaBasic;

public class User extends FatherUser{
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void next(String name){
        System.out.println(name);
    }

    public static void hai(Integer i){
        System.out.println(i);
    }
}
