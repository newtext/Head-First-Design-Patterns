package com.designpatterns.singleton;

public enum SingletonEnum {
    INSTANCE;

    int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

class SingletonClient {
    public static void main(String[] args) {
        SingletonEnum singleton = SingletonEnum.INSTANCE;
        System.out.println(singleton.getValue());
        singleton.setValue(2);
        System.out.println(singleton.getValue());
        SingletonEnum singleton2 = SingletonEnum.INSTANCE;
        System.out.println(singleton2.getValue());
    }
}
