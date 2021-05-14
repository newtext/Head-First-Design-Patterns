package com.designpatterns.singleton;

public class ThreadSafeSingleton {

    /*
    The volatile keyword ensures that multiple threads handle the uniqueInstance variable correctly when it
    is being initialized to the Singleton instance
     */
    private volatile static ThreadSafeSingleton uniqueInstance;

    private ThreadSafeSingleton() {}
    public static ThreadSafeSingleton getInstance() {
        if (uniqueInstance == null) { //Check for an instance and if there isn’t one, enter a synchronized block.
            synchronized (Singleton.class) { //Note we only synchronize the first time through!
                if (uniqueInstance == null) { //Once in the block, check again and if it’s still null, create an instance.
                    uniqueInstance = new ThreadSafeSingleton();
                }
            }
        }

        return uniqueInstance;
    }
}
