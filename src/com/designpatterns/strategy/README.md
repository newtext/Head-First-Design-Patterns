# Strategy Design Pattern

You take a class that does something specific in a lot of different ways and extract all of these algorithms into separate classes.

This allows us to add new behaviors to a class without modifying any of our existing behavior classes or touching any of the Duck subclass that uses certain behavior(s).

By delegating its flying/quacking behaviors to another class instead of defining the quacking and flying methods defined in Duck class or its subclass.

It would require a lot of work if we defined the behavior in the Duck class since we would need to make changes to all the subclasses.

Easier to add new behaviors to existing class (Duck) by delegating its features to another class.

Model Duck have flying behavior, but it cannot quack since quack behavior was not set in the constructor.

Model Duck can start using quack behaviors by dynamically setting the quack feature by using setQuackBehavior or add the behaviors in the constructor.

1. Ducks
   - IS a
        - Mallard Duck
        - Decoy Duck
        - Red Head Duck
        - Rubber Duck
        - Model Duck
    
    - HAS a
        - Flying Behavior
        - Quack Behavior
        - XXX Behaviors
    

