package com.ledolom.JavaBasic;


public enum UseEnum {

    NO(0,"否"),
    YES(1,"是"),
    ;

    private Integer code;

    private String desc;

    UseEnum(Integer code, String desc){
        this.code = code;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "UseEnum{" +
                "code=" + code +
                ", desc='" + desc + '\'' +
                '}';
    }

    public String getDesc() {
        return desc;
    }

    public Integer getCode() {
        return code;
    }
}
