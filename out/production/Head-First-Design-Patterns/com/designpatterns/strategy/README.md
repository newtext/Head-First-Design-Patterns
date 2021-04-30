# Strategy Design Pattern

You take a class that does something specific in a lot of different ways and extract all of these algorithms into separate classes

This allows us to add new behaviors to a class without modifying any of our existing behavior classes or touching any of the Duck class that uses flying behavior.

It delegates its flying and quacking behaviors, instead of using quacking and flying methods defined in Duck class or its subclass.


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
    
Makes it easier to add new behaviors to existing class (Duck) by delegating its features to another class.

Model Duck does have flying behavior, but it cannot quack since the constructor does not instantiate the quack behavior in the constructor  

