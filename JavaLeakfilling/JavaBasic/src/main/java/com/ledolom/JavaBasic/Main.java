package com.ledolom.JavaBasic;

public class Main {
    public static void main(String[] args) {
        Integer code = UseEnum.NO.getCode();
        System.out.println(code);
        System.out.println(UseEnum.valueOf("YES"));
    }
}
