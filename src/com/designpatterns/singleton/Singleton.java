package com.designpatterns.singleton;


public class Singleton {

    private static Singleton uniqueInstance;
    // other useful instance variables here
    private Singleton() {}

    /*
    There might be some race conditions if two threads are trying to access the singleton class at once for the first time
    It might enter the getInstance method before the creating the singleton object and it might get different singleton objects
    One way to resolve this issue is using the LazySingleton method where you declare the singleton object creation at the field level
    private static Singleton uniqueInstance = new Singleton();
    This will create the object even if the application is not being use, it might be useful sometime like database connections.
     */
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
// other useful methods here
}
