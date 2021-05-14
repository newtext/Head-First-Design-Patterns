package com.designpatterns.singleton;

public class SingletonField {

    //Go ahead and create an instance of Singleton in a static initializer.
    //This code is guaranteed to be thread safe!
    private static SingletonField uniqueInstance = new SingletonField();

    private SingletonField() {}

    //The JVM guarantees that the instance will be created before any thread accesses the static uniqueInstance variable.
    public static SingletonField getInstance() {
        return uniqueInstance;
    }



}
