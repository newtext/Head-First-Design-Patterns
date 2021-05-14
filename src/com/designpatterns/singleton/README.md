### Singleton Pattern

The Singleton Pattern ensures a class has only one instance, and provides a global point of access to it.

By making the constructor of the class private so only the class can initialize the object.

There are multiple ways to create a singleton object 

#### Method One
This Method will run into issues with threads/reflection since there might be some data race or race condition when accessing
getInstance() method and create two different Singleton object.

    private static Singleton uniqueInstance;

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

#### Method Two
    Application will always have Singleton object even if it's not being use
    public static final Singleton INSTANCE = new Singleton();
    public static SingletonField getInstance() {
        return uniqueInstance;
    }

#### Method Three
This Method will resolve the thread issues by declaring the singleton field as volatile for its visibility.
All read/write will be directly from the main memory instead of local.

If we just synchronized the method, then it will be very costly. 

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

#### Method Four
This method is the most preferred/best way by using enum to create Singleton without worrying about
synchronization, class loading issues, reflection, and serialization/deserialization issues

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
            System.out.println(singleton.getValue()); // 2
            singleton.setValue(2);
            System.out.println(singleton.getValue());  // 2
            SingletonEnum singleton2 = SingletonEnum.INSTANCE;
            System.out.println(singleton2.getValue()); // 2
        }
    }